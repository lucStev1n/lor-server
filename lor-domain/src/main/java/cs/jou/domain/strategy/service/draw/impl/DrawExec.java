package cs.jou.domain.strategy.service.draw.impl;

import cs.jou.domain.strategy.model.DrawReq;
import cs.jou.domain.strategy.model.DrawResult;
import cs.jou.domain.strategy.model.StrategyDetail;
import cs.jou.domain.strategy.model.StrategyRich;
import cs.jou.domain.strategy.model.vo.AwawrdVO;
import cs.jou.domain.strategy.repository.IStrategyRepository;
import cs.jou.domain.strategy.service.draw.BaseDraw;
import cs.jou.domain.strategy.service.draw.IDrawExec;
import cs.jou.domain.strategy.service.handle.IDRawAlgorithm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class DrawExec extends BaseDraw implements IDrawExec {
    final IStrategyRepository repository;

    @Override
    public DrawResult exec(DrawReq cmd) {
        StrategyRich rich = repository.queryStrategyRich(cmd.getStrategyId());
        List<StrategyDetail> detailList = rich.getStrategyDetailList();

        init(rich.getStrategyId(), rich.getStrategy().getStrategymode(), detailList);
        IDRawAlgorithm algorithm = getProvider().getAlgorithm();
        String awardId = algorithm.randomDraw(cmd.getStrategyId(), new ArrayList<>());

        AwawrdVO awawrdVO = repository.queryAwardInfo(awardId);

        return new DrawResult(cmd.getStrategyId(), cmd.getUid(),awardId, awawrdVO.getAwardname());
    }
}
