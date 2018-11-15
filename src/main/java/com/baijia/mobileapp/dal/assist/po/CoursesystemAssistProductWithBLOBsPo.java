package com.baijia.mobileapp.dal.assist.po;

public class CoursesystemAssistProductWithBLOBsPo extends CoursesystemAssistProductPo {
    /**
     * 缩略图。多张，例如['http://imgs.bjhl/1.jpg','http://imgs.bjhl/2.jpg',...]
     */
    private String thumbnail;

    /**
     * 瀑布流内容
     */
    private String content;

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail == null ? null : thumbnail.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}