package com.voofchat.freedom.biz.shop.entity.po;

import java.util.Date;

public class MiniappWxshopTagPo {
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
    private String pic;

    /**
     * 顺序
     */
    private Integer sortOrder;

    /**
     * 是否首页显示
     */
    private Boolean isHomeShow;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Boolean getIsHomeShow() {
        return isHomeShow;
    }

    public void setIsHomeShow(Boolean isHomeShow) {
        this.isHomeShow = isHomeShow;
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