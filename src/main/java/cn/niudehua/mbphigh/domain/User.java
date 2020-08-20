package cn.niudehua.mbphigh.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

/**
 * @author: deng
 * @datetime: 2020/8/20 12:27 上午
 */
@Data
@Builder
@TableName(value = "`user`")
public class User {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    /**
     * 姓名
     */
    @TableField(value = "name")
    private String name;

    /**
     * 年龄
     */
    @TableField(value = "age")
    private Integer age;

    /**
     * 邮箱
     */
    @TableField(value = "email")
    private String email;

    /**
     * 直属上级id
     */
    @TableField(value = "manager_id")
    private Long managerId;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    /**
     * 版本
     */
    @TableField(value = "version")
    private Integer version;

    /**
     * 逻辑删除标识(0.未删除,1.已删除)
     */
    @TableField(value = "deleted")
    @TableLogic
    private Integer deleted;
}