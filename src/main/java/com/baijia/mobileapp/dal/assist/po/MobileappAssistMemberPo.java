package com.baijia.mobileapp.dal.assist.po;

import java.util.Date;

public class MobileappAssistMemberPo {
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId == null ? null : unionId.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl == null ? null : headimgurl.trim();
    }

    public Integer getIdentityStatus() {
        return identityStatus;
    }

    public void setIdentityStatus(Integer identityStatus) {
        this.identityStatus = identityStatus;
    }

    public Integer getIsSubscribe() {
        return isSubscribe;
    }

    public void setIsSubscribe(Integer isSubscribe) {
        this.isSubscribe = isSubscribe;
    }

    public String getGsxAppId() {
        return gsxAppId;
    }

    public void setGsxAppId(String gsxAppId) {
        this.gsxAppId = gsxAppId == null ? null : gsxAppId.trim();
    }

    public String getGsxOpenId() {
        return gsxOpenId;
    }

    public void setGsxOpenId(String gsxOpenId) {
        this.gsxOpenId = gsxOpenId == null ? null : gsxOpenId.trim();
    }

    public String getPlatformCode() {
        return platformCode;
    }

    public void setPlatformCode(String platformCode) {
        this.platformCode = platformCode == null ? null : platformCode.trim();
    }

    public String getPlatformSecret() {
        return platformSecret;
    }

    public void setPlatformSecret(String platformSecret) {
        this.platformSecret = platformSecret == null ? null : platformSecret.trim();
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName == null ? null : platformName.trim();
    }

    public String getPlatformMobile() {
        return platformMobile;
    }

    public void setPlatformMobile(String platformMobile) {
        this.platformMobile = platformMobile == null ? null : platformMobile.trim();
    }

    public String getPlatformRemark() {
        return platformRemark;
    }

    public void setPlatformRemark(String platformRemark) {
        this.platformRemark = platformRemark == null ? null : platformRemark.trim();
    }

    public Integer getPlatformStatus() {
        return platformStatus;
    }

    public void setPlatformStatus(Integer platformStatus) {
        this.platformStatus = platformStatus;
    }

    public Date getPlatformCreateTime() {
        return platformCreateTime;
    }

    public void setPlatformCreateTime(Date platformCreateTime) {
        this.platformCreateTime = platformCreateTime;
    }

    public Date getPlatformUpdateTime() {
        return platformUpdateTime;
    }

    public void setPlatformUpdateTime(Date platformUpdateTime) {
        this.platformUpdateTime = platformUpdateTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}