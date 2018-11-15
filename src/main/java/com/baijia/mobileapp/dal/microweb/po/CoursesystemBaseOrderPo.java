package com.baijia.mobileapp.dal.microweb.po;

import java.math.BigDecimal;
import java.util.Date;

public class CoursesystemBaseOrderPo {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 小程序或者公众号appId
     */
    private String appId;

    /**
     * 小程序或者公众号openId
     */
    private String openId;

    /**
     * 微信union_id
     */
    private String unionId;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 1小程序，2公众号
     */
    private Integer identityType;

    /**
     * 任务类型，0默认直销，1分销，2拼团
     */
    private Integer type;

    /**
     * 订单编号
     */
    private String sn;

    /**
     * 支付订单编号
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
     * 商品id
     */
    private Integer productId;

    /**
     * 商品规格id
     */
    private Integer specId;

    /**
     * 业务方商品ID
     */
    private Integer refProductId;

    /**
     * 业务方商品规格ID
     */
    private Integer refSpecId;

    /**
     * 商铺id
     */
    private Integer shopId;

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
     * 收货地区
     */
    private String area;

    /**
     * 地区编码
     */
    private String areaCode;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商品图片
     */
    private String productImg;

    /**
     * 商品市场价格
     */
    private BigDecimal productMarketPrice;

    /**
     * 商品价格
     */
    private BigDecimal productPrice;

    /**
     * 商品类型，1表示虚拟商品，2表示实体商品，3表示虚拟+实体商品
     */
    private Integer productType;

    /**
     * 商品规格名称
     */
    private String specName;

    /**
     * 规格价格
     */
    private BigDecimal specPrice;

    /**
     * 商品购买数量
     */
    private Integer quantity;

    /**
     * 邮费
     */
    private BigDecimal postage;

    /**
     * 订单总额
     */
    private BigDecimal amount;

    /**
     * 状态0表示默认状态，1待支付，2支付成功，3支付失败,4全额退款，5部分退款，-1订单删除
     */
    private Integer status;

    /**
     * 订单支付时间
     */
    private Date payTime;

    /**
     * 规格已选下拉选项名称
     */
    private String specSelectLabel;

    /**
     * 规格已选下拉选项值
     */
    private String specSelectValue;

    /**
     * gsx公众号appId，静默授权
     */
    private String gsxAppId;

    /**
     * gsx公众号下用户openId，静默授权
     */
    private String gsxOpenId;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建时间
     */
    private Date createTime;

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

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId == null ? null : unionId.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Integer getIdentityType() {
        return identityType;
    }

    public void setIdentityType(Integer identityType) {
        this.identityType = identityType;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
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

    public Integer getRefProductId() {
        return refProductId;
    }

    public void setRefProductId(Integer refProductId) {
        this.refProductId = refProductId;
    }

    public Integer getRefSpecId() {
        return refSpecId;
    }

    public void setRefSpecId(Integer refSpecId) {
        this.refSpecId = refSpecId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
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

    public BigDecimal getProductMarketPrice() {
        return productMarketPrice;
    }

    public void setProductMarketPrice(BigDecimal productMarketPrice) {
        this.productMarketPrice = productMarketPrice;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName == null ? null : specName.trim();
    }

    public BigDecimal getSpecPrice() {
        return specPrice;
    }

    public void setSpecPrice(BigDecimal specPrice) {
        this.specPrice = specPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPostage() {
        return postage;
    }

    public void setPostage(BigDecimal postage) {
        this.postage = postage;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getSpecSelectLabel() {
        return specSelectLabel;
    }

    public void setSpecSelectLabel(String specSelectLabel) {
        this.specSelectLabel = specSelectLabel == null ? null : specSelectLabel.trim();
    }

    public String getSpecSelectValue() {
        return specSelectValue;
    }

    public void setSpecSelectValue(String specSelectValue) {
        this.specSelectValue = specSelectValue == null ? null : specSelectValue.trim();
    }

    public String getGsxAppId() {
        return gsxAppId;
    }

    public void setGsxAppId(String gsxAppId) {
        this.gsxAppId = gsxAppId == null ? null : gsxAppId.trim();
    }

    public String getGsxOpenId() {
        return gsxOpenId;
    }

    public void setGsxOpenId(String gsxOpenId) {
        this.gsxOpenId = gsxOpenId == null ? null : gsxOpenId.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}