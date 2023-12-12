package cs.jou.domain.strategy.model;

import cs.jou.domain.strategy.model.vo.StrategyVO;
import lombok.Data;

import java.util.List;

@Data
public class StrategyRich {
    private Long strategyId;
    private StrategyVO strategy;
    private List<StrategyDetail> strategyDetailList;
}
