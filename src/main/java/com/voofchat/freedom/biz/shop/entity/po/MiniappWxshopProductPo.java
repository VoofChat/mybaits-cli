package com.voofchat.freedom.biz.shop.entity.po;

import java.math.BigDecimal;
import java.util.Date;

public class MiniappWxshopProductPo {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 品牌ID
     */
    private Integer brandId;

    /**
     * 类别ID
     */
    private Integer categoryId;

    /**
     * 商品编号
     */
    private String sn;

    /**
     * 标题
     */
    private String title;

    /**
     * 商品主图
     */
    private String primaryPic;

    /**
     * 商品列表图
     */
    private String listPic;

    /**
     * 搜索关键字
     */
    private String keywords;

    /**
     * 简要
     */
    private String brief;

    /**
     * 顺序
     */
    private Integer sortOrder;

    /**
     * 市场价格
     */
    private BigDecimal marketPrice;

    /**
     * 零售价格
     */
    private BigDecimal retailPrice;

    /**
     * 销售量
     */
    private Integer sellVolume;

    /**
     * 是否最新
     */
    private Boolean isNew;

    /**
     * 是否最火
     */
    private Boolean isHot;

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

    /**
     * 详情
     */
    private String desc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getPrimaryPic() {
        return primaryPic;
    }

    public void setPrimaryPic(String primaryPic) {
        this.primaryPic = primaryPic == null ? null : primaryPic.trim();
    }

    public String getListPic() {
        return listPic;
    }

    public void setListPic(String listPic) {
        this.listPic = listPic == null ? null : listPic.trim();
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public BigDecimal getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(BigDecimal retailPrice) {
        this.retailPrice = retailPrice;
    }

    public Integer getSellVolume() {
        return sellVolume;
    }

    public void setSellVolume(Integer sellVolume) {
        this.sellVolume = sellVolume;
    }

    public Boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    public Boolean getIsHot() {
        return isHot;
    }

    public void setIsHot(Boolean isHot) {
        this.isHot = isHot;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}