package cs.jou.infrastructure.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 活动配置
 * @TableName activity
 */
@TableName(value ="activity")
@Data
public class Activity implements Serializable {
    /**
     * 自增ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 活动ID
     */
    @TableField(value = "activityId")
    private Long activityid;

    /**
     * 活动名称
     */
    @TableField(value = "activityName")
    private String activityname;

    /**
     * 活动描述
     */
    @TableField(value = "activityDesc")
    private String activitydesc;

    /**
     * 开始时间
     */
    @TableField(value = "beginDateTime")
    private Date begindatetime;

    /**
     * 结束时间
     */
    @TableField(value = "endDateTime")
    private Date enddatetime;

    /**
     * 库存
     */
    @TableField(value = "stockCount")
    private Integer stockcount;

    /**
     * 每人可参与次数
     */
    @TableField(value = "takeCount")
    private Integer takecount;

    /**
     * 活动状态：编辑、提审、撤审、通过、运行、拒绝、关闭、开启
     */
    @TableField(value = "state")
    private Integer state;

    /**
     * 创建人
     */
    @TableField(value = "creator")
    private String creator;

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