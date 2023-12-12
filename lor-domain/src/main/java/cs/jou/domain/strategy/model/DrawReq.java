package cs.jou.domain.strategy.model;

import lombok.Data;

@Data
public class DrawReq {
    private Long strategyId;
    private Integer uid;
    private String awardId;
    private String awardName;
}
