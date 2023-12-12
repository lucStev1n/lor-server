package cs.jou.domain.strategy.repository;

import cs.jou.domain.strategy.model.StrategyRich;
import cs.jou.domain.strategy.model.vo.AwawrdVO;

public interface IStrategyRepository {
    StrategyRich queryStrategyRich(Long id);
    AwawrdVO queryAwardInfo(String id);
}
