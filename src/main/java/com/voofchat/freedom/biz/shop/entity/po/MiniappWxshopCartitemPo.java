package com.voofchat.freedom.biz.shop.entity.po;

import java.util.Date;

public class MiniappWxshopCartitemPo {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 购物车Id
     */
    private Integer cartId;

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
     * 商品数量
     */
    private Integer quantity;

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

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
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