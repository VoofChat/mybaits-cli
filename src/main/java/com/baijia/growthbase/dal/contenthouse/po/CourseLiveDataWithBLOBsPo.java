package com.baijia.growthbase.dal.contenthouse.po;

public class CourseLiveDataWithBLOBsPo extends CourseLiveDataPo {
    /**
     * 内容(json字符串)
     */
    private String content;

    /**
     * "interaction_content": "互动内容",\n        "user_name": "互动人名",\n        "head_img_url": "头像",\n        "union_id":"互动人的id",\n        "interaction_id": "互动表中的id"，\n        "to_user_name": "接受打赏的人的名字",\n        "money": float
     */
    private String info;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }
}