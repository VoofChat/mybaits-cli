package com.baijia.mobileapp.dal.contenthouse.po;

import java.util.Date;

public class ContenthouseColumnPo {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * U群账户id
     */
    private Integer accountId;

    /**
     * 标题
     */
    private String title;

    /**
     * 缩略图。多张，例如['http://imgs.bjhl/1.jpg','http://imgs.bjhl/2.jpg',...]
     */
    private String thumbnail;

    /**
     * 详情页图片。多张，例如['http://imgs.bjhl/1.jpg','http://imgs.bjhl/2.jpg',...]
     */
    private String covers;

    /**
     * 单品数
     */
    private Integer contentCount;

    /**
     * URL链接
     */
    private String url;

    /**
     * 内容状态，-1表示删除
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

    /**
     * 详情
     */
    private String description;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail == null ? null : thumbnail.trim();
    }

    public String getCovers() {
        return covers;
    }

    public void setCovers(String covers) {
        this.covers = covers == null ? null : covers.trim();
    }

    public Integer getContentCount() {
        return contentCount;
    }

    public void setContentCount(Integer contentCount) {
        this.contentCount = contentCount;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}