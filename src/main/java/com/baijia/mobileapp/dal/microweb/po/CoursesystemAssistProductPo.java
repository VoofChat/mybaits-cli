package com.baijia.mobileapp.dal.microweb.po;

import java.math.BigDecimal;
import java.util.Date;

public class CoursesystemAssistProductPo {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * U群账户id
     */
    private Integer accountId;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 公众号appId
     */
    private String appId;

    /**
     * 公众号二维码
     */
    private String qrcode;

    /**
     * 商铺id
     */
    private Integer shopId;

    /**
     * 商品id
     */
    private Integer baseProductId;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 助力商品销量
     */
    private Integer saleCount;

    /**
     * 累计助力人数
     */
    private Integer activityCount;

    /**
     * 助力最多人数
     */
    private Integer assistCount;

    /**
     * 最低价
     */
    private BigDecimal activityPriceMin;

    /**
     * 最高价
     */
    private BigDecimal activityPriceMax;

    /**
     * 转发卡片json
     */
    private String forwardCard;

    /**
     * 商品状态，0表示默认状态，1上架，2下架，-1删除
     */
    private Integer status;

    /**
     * 活动开始时间
     */
    private Date startTime;

    /**
     * 活动结束时间
     */
    private Date endTime;

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

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode == null ? null : qrcode.trim();
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getBaseProductId() {
        return baseProductId;
    }

    public void setBaseProductId(Integer baseProductId) {
        this.baseProductId = baseProductId;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(Integer saleCount) {
        this.saleCount = saleCount;
    }

    public Integer getActivityCount() {
        return activityCount;
    }

    public void setActivityCount(Integer activityCount) {
        this.activityCount = activityCount;
    }

    public Integer getAssistCount() {
        return assistCount;
    }

    public void setAssistCount(Integer assistCount) {
        this.assistCount = assistCount;
    }

    public BigDecimal getActivityPriceMin() {
        return activityPriceMin;
    }

    public void setActivityPriceMin(BigDecimal activityPriceMin) {
        this.activityPriceMin = activityPriceMin;
    }

    public BigDecimal getActivityPriceMax() {
        return activityPriceMax;
    }

    public void setActivityPriceMax(BigDecimal activityPriceMax) {
        this.activityPriceMax = activityPriceMax;
    }

    public String getForwardCard() {
        return forwardCard;
    }

    public void setForwardCard(String forwardCard) {
        this.forwardCard = forwardCard == null ? null : forwardCard.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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