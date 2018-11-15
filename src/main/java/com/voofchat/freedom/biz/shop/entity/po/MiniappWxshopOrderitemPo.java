package com.voofchat.freedom.biz.shop.entity.po;

import java.math.BigDecimal;
import java.util.Date;

public class MiniappWxshopOrderitemPo {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 订单Id
     */
    private Integer orderId;

    /**
     * 商品ID
     */
    private Integer productId;

    /**
     * 第一规格ID
     */
    private Integer firstSpecificationId;

    /**
     * 第二规格ID
     */
    private Integer secondSpecificationId;

    /**
     * 商品名称
     */
    private String productTitle;

    /**
     * 商品简要描述
     */
    private String productBrief;

    /**
     * 市场价格
     */
    private BigDecimal productMarketPrice;

    /**
     * 零售价格
     */
    private BigDecimal productRetailPrice;

    /**
     * 商品列表图片
     */
    private String productListPic;

    /**
     * 商品数量
     */
    private Integer productQuantity;

    /**
     * 内容状态，-1表示删除
     */
    private Byte status;

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

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getFirstSpecificationId() {
        return firstSpecificationId;
    }

    public void setFirstSpecificationId(Integer firstSpecificationId) {
        this.firstSpecificationId = firstSpecificationId;
    }

    public Integer getSecondSpecificationId() {
        return secondSpecificationId;
    }

    public void setSecondSpecificationId(Integer secondSpecificationId) {
        this.secondSpecificationId = secondSpecificationId;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle == null ? null : productTitle.trim();
    }

    public String getProductBrief() {
        return productBrief;
    }

    public void setProductBrief(String productBrief) {
        this.productBrief = productBrief == null ? null : productBrief.trim();
    }

    public BigDecimal getProductMarketPrice() {
        return productMarketPrice;
    }

    public void setProductMarketPrice(BigDecimal productMarketPrice) {
        this.productMarketPrice = productMarketPrice;
    }

    public BigDecimal getProductRetailPrice() {
        return productRetailPrice;
    }

    public void setProductRetailPrice(BigDecimal productRetailPrice) {
        this.productRetailPrice = productRetailPrice;
    }

    public String getProductListPic() {
        return productListPic;
    }

    public void setProductListPic(String productListPic) {
        this.productListPic = productListPic == null ? null : productListPic.trim();
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
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