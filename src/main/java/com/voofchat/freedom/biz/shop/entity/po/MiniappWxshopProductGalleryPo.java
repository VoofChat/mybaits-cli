package com.voofchat.freedom.biz.shop.entity.po;

public class MiniappWxshopProductGalleryPo {
    /**
     * 主键Id
     */
    private Integer id;

    /**
     * 商品Id
     */
    private Integer productId;

    /**
     * 图片
     */
    private String picUrl;

    /**
     * 图片描述
     */
    private String picDesc;

    /**
     * 顺序
     */
    private Integer sortOrder;

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

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public String getPicDesc() {
        return picDesc;
    }

    public void setPicDesc(String picDesc) {
        this.picDesc = picDesc == null ? null : picDesc.trim();
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }
}