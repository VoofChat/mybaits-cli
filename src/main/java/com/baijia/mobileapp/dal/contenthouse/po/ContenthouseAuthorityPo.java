package com.baijia.mobileapp.dal.contenthouse.po;

import java.util.Date;

public class ContenthouseAuthorityPo {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 公众号appId
     */
    private String appId;

    /**
     * 公众号用户openId
     */
    private String openId;

    /**
     * 公众号用户unionId
     */
    private String unionId;

    /**
     * 静默授权appId
     */
    private String gsxAppId;

    /**
     * 静默授权openId
     */
    private String gsxOpenId;

    /**
     * 订单编号
     */
    private String orderSn;

    /**
     * 内容id
     */
    private Integer contentId;

    /**
     * 专栏id
     */
    private Integer columnId;

    /**
     * 内容状态，-1表示删除
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

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public Integer getColumnId() {
        return columnId;
    }

    public void setColumnId(Integer columnId) {
        this.columnId = columnId;
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