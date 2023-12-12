package cs.jou.domain.strategy.service.handle;

import cs.jou.domain.strategy.model.AwardRateInfo;

import java.util.List;

public interface IDRawAlgorithm {

    void init(Long strategyId, List<AwardRateInfo> awardRates);

    boolean isBuild(Long strategyId);

    String randomDraw(Long strategyId, List<String> excludeAwardIds);
}
