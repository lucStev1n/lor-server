package cs.jou.infrastructure.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 策略配置
 * @TableName strategy
 */
@TableName(value ="strategy")
@Data
public class Strategy implements Serializable {
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
     * 策略描述
     */
    @TableField(value = "strategyDesc")
    private String strategydesc;

    /**
     * 策略方式「1:单项概率、2:总体概率」
     */
    @TableField(value = "strategyMode")
    private Integer strategymode;

    /**
     * 发放奖品方式「1:即时、2:定时[含活动结束]、3:人工」
     */
    @TableField(value = "grantType")
    private Integer granttype;

    /**
     * 发放奖品时间
     */
    @TableField(value = "grantDate")
    private Date grantdate;

    /**
     * 扩展信息
     */
    @TableField(value = "extInfo")
    private String extinfo;

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