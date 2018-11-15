package com.baijia.growthbase.dal.contenthouse.po;

import java.util.Date;

public class CourseLiveDataPo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 数据来源,0:微信，1:网页
     */
    private Integer source;

    /**
     * 发起动作的用户名
     */
    private String userName;

    /**
     * 发起动作的头像
     */
    private String headImgUrl;

    /**
     * 发起动作的微信id
     */
    private String wechatId;

    /**
     * 发起动作的微信union_id
     */
    private String unionId;

    /**
     * 与wechat_msg_type保持一致
     */
    private Integer dataType;

    /**
     * 任务的编号
     */
    private Long liveRoomNum;

    /**
     * 0:不能使用,1:能使用
     */
    private Integer amrFileFlag;

    /**
     * 0:不能使用,1:能使用
     */
    private Integer mp3FileFlag;

    /**
     * 系统消息：0， 应用消息：1
     */
    private Integer type;

    /**
     * 操作类型，0直播消息，1回复消息，2上墙，3公告，4打赏
     */
    private Integer infoType;

    /**
     * 点赞数
     */
    private Integer likeCount;

    /**
     * 发言身份,1：助教，2：讲师，3：主持人，4：学生
     */
    private Integer identity;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 发起动作的微信open_id
     */
    private String openId;

    /**
     * 发起动作的微信app_id
     */
    private String appId;

    /**
     * 直播记录状态:0 normal，-1 delete
     */
    private Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl == null ? null : headImgUrl.trim();
    }

    public String getWechatId() {
        return wechatId;
    }

    public void setWechatId(String wechatId) {
        this.wechatId = wechatId == null ? null : wechatId.trim();
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId == null ? null : unionId.trim();
    }

    public Integer getDataType() {
        return dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public Long getLiveRoomNum() {
        return liveRoomNum;
    }

    public void setLiveRoomNum(Long liveRoomNum) {
        this.liveRoomNum = liveRoomNum;
    }

    public Integer getAmrFileFlag() {
        return amrFileFlag;
    }

    public void setAmrFileFlag(Integer amrFileFlag) {
        this.amrFileFlag = amrFileFlag;
    }

    public Integer getMp3FileFlag() {
        return mp3FileFlag;
    }

    public void setMp3FileFlag(Integer mp3FileFlag) {
        this.mp3FileFlag = mp3FileFlag;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getInfoType() {
        return infoType;
    }

    public void setInfoType(Integer infoType) {
        this.infoType = infoType;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
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

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}