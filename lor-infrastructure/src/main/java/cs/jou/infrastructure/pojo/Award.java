package cs.jou.infrastructure.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 奖品配置
 * @TableName award
 */
@TableName(value ="award")
@Data
public class Award implements Serializable {
    /**
     * 自增ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 奖品ID
     */
    @TableField(value = "awardId")
    private Long awardid;

    /**
     * 奖品类型（文字描述、兑换码、优惠券、实物奖品暂无）
     */
    @TableField(value = "awardType")
    private Integer awardtype;

    /**
     * 奖品数量
     */
    @TableField(value = "awardCount")
    private Integer awardcount;

    /**
     * 奖品名称
     */
    @TableField(value = "awardName")
    private String awardname;

    /**
     * 奖品内容「文字描述、Key、码」
     */
    @TableField(value = "awardContent")
    private String awardcontent;

    /**
     * 创建时间
     */
    @TableField(value = "createTime")
    private Date createtime;

    /**
     * updateTime
     */
    @TableField(value = "updateTime")
    private Date updatetime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}