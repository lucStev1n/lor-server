package cs.jou.infrastructure.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 策略明细
 * @TableName strategy_detail
 */
@TableName(value ="strategy_detail")
@Data
public class StrategyDetail implements Serializable {
    /**
     * 自增ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 策略ID
     */
    @TableField(value = "strategyId")
    private Long strategyid;

    /**
     * 奖品ID
     */
    @TableField(value = "awardId")
    private Long awardid;

    /**
     * 奖品数量
     */
    @TableField(value = "awardCount")
    private Integer awardcount;

    /**
     * 中奖概率
     */
    @TableField(value = "awardRate")
    private BigDecimal awardrate;

    /**
     * 创建时间
     */
    @TableField(value = "createTime")
    private Date createtime;

    /**
     * 修改时间
     */
    @TableField(value = "updateTime")
    private Date updatetime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}