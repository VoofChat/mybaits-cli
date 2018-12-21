package com.baijia.growthbase.dal.sharehouse.base.po;

import java.util.Date;
import lombok.Data;

/**
 * 实体SharehouseBaseMemberPO对应数据库表rp_sharehouse_base_member
 * 
 * @author: 郑志雄
 * @email: zhengzhixiong@baijiahulian.com
 * @date: 2018年12月20 11:46
 * @description: 
 */
@Data
public class SharehouseBaseMemberPO {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 公众号appId
     */
    private String appId;

    /**
     * 用户openId
     */
    private String openId;

    /**
     * 用户unionId
     */
    private String unionId;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 用户头像
     */
    private String headimgurl;

    /**
     * 用户身份，0表示真实用户，1表示机器人
     */
    private Integer identityStatus;

    /**
     * 是否关注appId主动授权对应公众号，0表示未关注，1表示已关注
     */
    private Integer isSubscribe;

    /**
     * gsx公众号appId，静默授权
     */
    private String gsxAppId;

    /**
     * gsx公众号下用户openId，静默授权
     */
    private String gsxOpenId;

    /**
     * 平台用户唯一标识吗
     */
    private String platformCode;

    /**
     * 平台用户密钥
     */
    private String platformSecret;

    /**
     * 平台用户注册名称
     */
    private String platformName;

    /**
     * 平台用户注册手机号
     */
    private String platformMobile;

    /**
     * 平台用户备注信息
     */
    private String platformRemark;

    /**
     * 平台用户状态
     */
    private Integer platformStatus;

    /**
     * 平台用户注册时间
     */
    private Date platformCreateTime;

    /**
     * 平台用户更新时间
     */
    private Date platformUpdateTime;

    /**
     * 状态0表示默认状态，-1删除
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