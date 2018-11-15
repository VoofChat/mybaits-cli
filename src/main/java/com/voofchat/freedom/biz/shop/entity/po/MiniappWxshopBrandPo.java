package com.voofchat.freedom.biz.shop.entity.po;

import java.util.Date;

public class MiniappWxshopBrandPo {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 列表图片
     */
    private String listPic;

    /**
     * 展示图片
     */
    private String showPic;

    /**
     * 简介
     */
    private String brief;

    /**
     * 顺序
     */
    private Integer sortOrder;

    /**
     * 是否显示
     */
    private Boolean isShow;

    /**
     * 是否新品牌
     */
    private Boolean isNew;

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
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getListPic() {
        return listPic;
    }

    public void setListPic(String listPic) {
        this.listPic = listPic == null ? null : listPic.trim();
    }

    public String getShowPic() {
        return showPic;
    }

    public void setShowPic(String showPic) {
        this.showPic = showPic == null ? null : showPic.trim();
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

    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    public Boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}