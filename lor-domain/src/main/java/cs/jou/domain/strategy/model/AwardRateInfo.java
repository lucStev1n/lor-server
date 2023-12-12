package cs.jou.domain.strategy.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class AwardRateInfo {
    private String awardId;
    private BigDecimal awardRate;
}
