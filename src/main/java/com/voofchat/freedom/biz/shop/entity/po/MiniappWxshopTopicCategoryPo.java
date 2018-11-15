package com.voofchat.freedom.biz.shop.entity.po;

public class MiniappWxshopTopicCategoryPo {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 图片地址
     */
    private String img;

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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }
}