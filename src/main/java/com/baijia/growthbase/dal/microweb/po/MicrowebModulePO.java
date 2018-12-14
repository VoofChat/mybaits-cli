package com.baijia.growthbase.dal.microweb.po;

import java.util.Date;
import lombok.Data;

/**
 * 实体MicrowebModulePO对应数据库表rp_microweb_module
 * 
 * @author: 郑志雄
 * @email: zhengzhixiong@baijiahulian.com
 * @date: 2018年12月14 16:25
 * @description: 
 */
@Data
public class MicrowebModulePO {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 类型Id
     */
    private Integer typeId;

    /**
     * 标题
     */
    private String title;

    /**
     * 图片
     */
    private String img;

    /**
     * 状态，0表示默认状态，-1删除
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}