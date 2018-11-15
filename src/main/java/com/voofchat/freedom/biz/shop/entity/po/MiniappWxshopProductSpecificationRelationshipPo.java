package com.voofchat.freedom.biz.shop.entity.po;

public class MiniappWxshopProductSpecificationRelationshipPo {
    /**
     * 主键Id
     */
    private Integer id;

    /**
     * 商品Id
     */
    private Integer productId;

    /**
     * 第一规格Id
     */
    private Integer firstSpecificationId;

    /**
     * 第二规格Id
     */
    private Integer secondSpecificationId;

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
}