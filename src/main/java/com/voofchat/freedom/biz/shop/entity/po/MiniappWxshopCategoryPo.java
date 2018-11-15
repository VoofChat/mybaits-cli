package com.voofchat.freedom.biz.shop.entity.po;

public class MiniappWxshopCategoryPo {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 关键字
     */
    private String keywords;

    /**
     * 父类别
     */
    private Integer parentId;

    /**
     * 顺序
     */
    private Byte sortOrder;

    /**
     * 是否显示
     */
    private Boolean isShow;

    /**
     * icon
     */
    private String icon;

    /**
     * 图片
     */
    private String pic;

    /**
     * 类别类型
     */
    private Byte type;

    /**
     * 层级
     */
    private Integer level;

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

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Byte getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Byte sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}