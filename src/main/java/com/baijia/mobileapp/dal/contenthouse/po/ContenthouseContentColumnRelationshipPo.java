package com.baijia.mobileapp.dal.contenthouse.po;

import java.util.Date;

public class ContenthouseContentColumnRelationshipPo {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 内容专栏主键
     */
    private Integer columId;

    /**
     * 内容主键
     */
    private Integer contentId;

    /**
     * 单品在专栏的顺序
     */
    private Integer index;

    /**
     * 单品是否免费
     */
    private Boolean isFree;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getColumId() {
        return columId;
    }

    public void setColumId(Integer columId) {
        this.columId = columId;
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Boolean getIsFree() {
        return isFree;
    }

    public void setIsFree(Boolean isFree) {
        this.isFree = isFree;
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