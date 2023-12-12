package cs.jou.domain.strategy.service.draw;

import cs.jou.domain.strategy.model.AwardRateInfo;
import cs.jou.domain.strategy.model.StrategyDetail;
import cs.jou.domain.strategy.service.handle.IDRawAlgorithm;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class BaseDraw {

    private DrawProvider provider = new DrawProvider();

    public void init(Long strategyId, Integer mode, List<StrategyDetail> details) {
        provider.setModel(mode);
        IDRawAlgorithm algorithm = provider.getAlgorithm();

        boolean existRateTuple = algorithm.isBuild(strategyId);
        if (existRateTuple) {
            return;
        }

        //        List<AwardRateInfo> awardRateInfos = new ArrayList<>(details.size());
        //        for (StrategyDetail detail : details) {
        //            awardRateInfos.add(new AwardRateInfo(detail.getAwardId(), detail.getAwardRate()));
        //        }

        List<AwardRateInfo> awardRateInfos = details.stream()
                                                    .map(detail -> new AwardRateInfo(detail.getAwardId(),
                                                                                     detail.getAwardRate()))
                                                    .collect(Collectors.toList());

        algorithm.init(strategyId, awardRateInfos);
    }
}
