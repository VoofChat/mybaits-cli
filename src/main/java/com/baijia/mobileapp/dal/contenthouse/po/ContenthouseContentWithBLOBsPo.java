package com.baijia.mobileapp.dal.contenthouse.po;

public class ContenthouseContentWithBLOBsPo extends ContenthouseContentPo {
    /**
     * json字符串
     */
    private String content;

    /**
     * 详情
     */
    private String description;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}