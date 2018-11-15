package com.baijia.mobileapp.dal.assist.po;

import java.math.BigDecimal;
import java.util.Date;

public class CoursesystemAssistSpecPo {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 公众号appId
     */
    private String appId;

    /**
     * 助力商品id
     */
    private Integer productId;

    /**
     * 课程系统商品id
     */
    private Integer baseProductId;

    /**
     * 课程系统商品规格id
     */
    private Integer baseSpecId;

    /**
     * 规格名称
     */
    private String name;

    /**
     * 规格库存
     */
    private Integer stock;

    /**
     * 规格销量
     */
    private Integer saleCount;

    /**
     * 活动价格
     */
    private BigDecimal activityPrice;

    /**
     * 规格状态，0表示默认，1使用，2未使用，-1删除
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

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getBaseProductId() {
        return baseProductId;
    }

    public void setBaseProductId(Integer baseProductId) {
        this.baseProductId = baseProductId;
    }

    public Integer getBaseSpecId() {
        return baseSpecId;
    }

    public void setBaseSpecId(Integer baseSpecId) {
        this.baseSpecId = baseSpecId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public BigDecimal getActivityPrice() {
        return activityPrice;
    }

    public void setActivityPrice(BigDecimal activityPrice) {
        this.activityPrice = activityPrice;
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