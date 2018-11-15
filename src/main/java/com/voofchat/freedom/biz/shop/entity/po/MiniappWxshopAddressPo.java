package com.voofchat.freedom.biz.shop.entity.po;

import java.util.Date;

public class MiniappWxshopAddressPo {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 会员id
     */
    private Integer memberId;

    /**
     * 收货人姓名
     */
    private String consignee;

    /**
     * 收货人联系电话
     */
    private String phone;

    /**
     * 收货人详细地址
     */
    private String address;

    /**
     * 0表示默认状态，-1表示删除
     */
    private Integer status;

    /**
     * 是否是默认收货地址
     */
    private Boolean isDeafult;

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

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getIsDeafult() {
        return isDeafult;
    }

    public void setIsDeafult(Boolean isDeafult) {
        this.isDeafult = isDeafult;
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