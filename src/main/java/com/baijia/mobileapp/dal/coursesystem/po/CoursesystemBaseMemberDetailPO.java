package com.baijia.mobileapp.dal.coursesystem.po;

import java.util.Date;
import lombok.Data;

/**
 * 实体CoursesystemBaseMemberDetailPO对应数据库表rp_coursesystem_base_member_detail
 * 
 * @author: 郑志雄
 * @email: zhengzhixiong@baijiahulian.com
 * @date: 2018年12月21 15:33
 * @description: 
 */
@Data
public class CoursesystemBaseMemberDetailPO {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer memberId;

    /**
     * 营销任务类型，0默认直销，1分销，2拼团，3助力，4分享任务
     */
    private Integer jobType;

    /**
     * 状态0表示默认状态
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