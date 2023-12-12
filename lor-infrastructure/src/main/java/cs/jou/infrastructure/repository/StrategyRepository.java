package cs.jou.infrastructure.repository;

import cs.jou.domain.strategy.model.StrategyRich;
import cs.jou.domain.strategy.model.vo.AwawrdVO;
import cs.jou.domain.strategy.repository.IStrategyRepository;
import cs.jou.infrastructure.service.ActivityService;
import cs.jou.infrastructure.service.AwardService;
import cs.jou.infrastructure.service.StrategyDetailService;
import cs.jou.infrastructure.service.StrategyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StrategyRepository implements IStrategyRepository {
    final AwardService awardDao;
    final StrategyService strategyDao;
    final StrategyDetailService detailDao;
    final ActivityService activityDao;

    @Override
    public StrategyRich queryStrategyRich(Long id) {
        return null;
    }

    @Override
    public AwawrdVO queryAwardInfo(String id) {
        return null;
    }
}
