package com.baijia.mobileapp.dal.microweb.po;

import java.util.Date;

public class MicrowebTypegroupPo {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 组类型编码
     */
    private String typegroupCode;

    /**
     * 组类型编码名称
     */
    private String typegroupName;

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

    public String getTypegroupCode() {
        return typegroupCode;
    }

    public void setTypegroupCode(String typegroupCode) {
        this.typegroupCode = typegroupCode == null ? null : typegroupCode.trim();
    }

    public String getTypegroupName() {
        return typegroupName;
    }

    public void setTypegroupName(String typegroupName) {
        this.typegroupName = typegroupName == null ? null : typegroupName.trim();
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