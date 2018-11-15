package com.voofchat.freedom.biz.shop.entity.po;

public class MiniappWxshopProductSpecificationPo {
    /**
     * 主键Id
     */
    private Integer id;

    /**
     * 商品Id
     */
    private Integer productId;

    /**
     * 规格Id
     */
    private Integer specificationId;

    /**
     * 规格库存
     */
    private Integer stock;

    /**
     * 规格值
     */
    private String value;

    /**
     * 规格图片
     */
    private String picUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getSpecificationId() {
        return specificationId;
    }

    public void setSpecificationId(Integer specificationId) {
        this.specificationId = specificationId;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }
}