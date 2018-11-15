package com.baijia.mobileapp.dal.microweb.po;

import java.math.BigDecimal;
import java.util.Date;

public class MobileappAssistOrderPo {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer memberId;

    /**
     * 订单编号
     */
    private String sn;

    /**
     * 订单总额
     */
    private BigDecimal amount;

    /**
     * 拼团id
     */
    private Integer activityId;

    /**
     * 团成员主键
     */
    private Integer activityMemberId;

    /**
     * 拼团商品id
     */
    private Integer productId;

    /**
     * 商品类型，1表示虚拟商品，2表示实体商品，3表示虚拟+实体商品
     */
    private Integer productType;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商品缩略图
     */
    private String productImg;

    /**
     * 规格市场价
     */
    private BigDecimal productMarketPrice;

    /**
     * 规格拼团价
     */
    private BigDecimal productPrice;

    /**
     * 拼团规格id
     */
    private Integer specId;

    /**
     * 规格名称
     */
    private String specName;

    /**
     * 规格拼团价
     */
    private BigDecimal specPrice;

    /**
     * 订单状态，0表示待支付，1已支付，-1表示删除
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

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getActivityMemberId() {
        return activityMemberId;
    }

    public void setActivityMemberId(Integer activityMemberId) {
        this.activityMemberId = activityMemberId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductImg() {
        return productImg;
    }

    public void setProductImg(String productImg) {
        this.productImg = productImg == null ? null : productImg.trim();
    }

    public BigDecimal getProductMarketPrice() {
        return productMarketPrice;
    }

    public void setProductMarketPrice(BigDecimal productMarketPrice) {
        this.productMarketPrice = productMarketPrice;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getSpecId() {
        return specId;
    }

    public void setSpecId(Integer specId) {
        this.specId = specId;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName == null ? null : specName.trim();
    }

    public BigDecimal getSpecPrice() {
        return specPrice;
    }

    public void setSpecPrice(BigDecimal specPrice) {
        this.specPrice = specPrice;
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