package com.baijia.mobileapp.dal.microweb.po;

import java.util.Date;

public class MicrowebTypePo {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 类型编码
     */
    private String typeCode;

    /**
     * 类型编码名称
     */
    private String typeName;

    /**
     * 类型组
     */
    private Integer typeGroupId;

    /**
     * 状态，0表示默认状态，-1删除
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

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode == null ? null : typeCode.trim();
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public Integer getTypeGroupId() {
        return typeGroupId;
    }

    public void setTypeGroupId(Integer typeGroupId) {
        this.typeGroupId = typeGroupId;
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