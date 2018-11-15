package com.voofchat.freedom.biz.shop.entity.po;

public class MiniappWxshopSpecificationPo {
    /**
     * 主键Id
     */
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 显示顺序
     */
    private Byte sortOrder;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Byte sortOrder) {
        this.sortOrder = sortOrder;
    }
}