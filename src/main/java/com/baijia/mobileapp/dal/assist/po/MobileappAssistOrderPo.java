package com.baijia.mobileapp.dal.assist.po;

import java.math.BigDecimal;
import java.util.Date;

public class MobileappAssistOrderPo {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 公众号appId
     */
    private String appId;

    /**
     * 助力商品id
     */
    private Integer productId;

    /**
     * 助力规格id
     */
    private Integer specId;

    /**
     * 用户id
     */
    private Integer memberId;

    /**
     * 商铺id
     */
    private Integer shopId;

    /**
     * 助力活动id
     */
    private Integer activityId;

    /**
     * 活动成员主键
     */
    private Integer activityMemberId;

    /**
     * 地址id，仅实体商品才有
     */
    private Integer addressId;

    /**
     * 收件人姓名
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
     * 收货地区
     */
    private String area;

    /**
     * 地区编码
     */
    private String areaCode;

    /**
     * 订单编号
     */
    private String orderSn;

    /**
     * 订单总额
     */
    private BigDecimal amount;

    /**
     * 商品类型，1表示虚拟商品，2表示实体商品，3表示虚拟+实体商品
     */
    private Integer productType;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商品缩略图
     */
    private String productImg;

    /**
     * 规格名称
     */
    private String specName;

    /**
     * 规格市场价
     */
    private BigDecimal marketPrice;

    /**
     * 规格拼团价
     */
    private BigDecimal activityPrice;

    /**
     * 订单状态，0表示待支付，1已支付，-1表示删除
     */
    private Integer status;

    /**
     * 平台支付订单编号
     */
    private String payOrderNumber;

    /**
     * 第三方支付返回的编号
     */
    private String thirdTradeNo;

    /**
     * 第三方支付使用的平台订单号
     */
    private String platformTradeNo;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 平台支付回调结果
     */
    private String payOrderResult;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getSpecId() {
        return specId;
    }

    public void setSpecId(Integer specId) {
        this.specId = specId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getActivityMemberId() {
        return activityMemberId;
    }

    public void setActivityMemberId(Integer activityMemberId) {
        this.activityMemberId = activityMemberId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductImg() {
        return productImg;
    }

    public void setProductImg(String productImg) {
        this.productImg = productImg == null ? null : productImg.trim();
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName == null ? null : specName.trim();
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public BigDecimal getActivityPrice() {
        return activityPrice;
    }

    public void setActivityPrice(BigDecimal activityPrice) {
        this.activityPrice = activityPrice;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPayOrderNumber() {
        return payOrderNumber;
    }

    public void setPayOrderNumber(String payOrderNumber) {
        this.payOrderNumber = payOrderNumber == null ? null : payOrderNumber.trim();
    }

    public String getThirdTradeNo() {
        return thirdTradeNo;
    }

    public void setThirdTradeNo(String thirdTradeNo) {
        this.thirdTradeNo = thirdTradeNo == null ? null : thirdTradeNo.trim();
    }

    public String getPlatformTradeNo() {
        return platformTradeNo;
    }

    public void setPlatformTradeNo(String platformTradeNo) {
        this.platformTradeNo = platformTradeNo == null ? null : platformTradeNo.trim();
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

    public String getPayOrderResult() {
        return payOrderResult;
    }

    public void setPayOrderResult(String payOrderResult) {
        this.payOrderResult = payOrderResult == null ? null : payOrderResult.trim();
    }
}