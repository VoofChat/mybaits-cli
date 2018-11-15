package com.baijia.growthbase.dal.contenthouse.po;

import java.util.Date;

public class CourseLiveTaskPo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 账户id
     */
    private Integer accountId;

    /**
     * 课程主题
     */
    private String topic;

    /**
     * 课程开始时间
     */
    private Date beginTime;

    /**
     * 直播间代码
     */
    private Long liveRoomNum;

    /**
     * 来源，0:群内，1:h5
     */
    private Integer source;

    /**
     * 直播标记:0 ready，2 closed，-1 delete
     */
    private Integer status;

    /**
     * 直播间未到开课时间背景图片
     */
    private String timerImg;

    /**
     * 直播音频导出状态, 异常(-1), 异常(0), 导出准备(1), 导出中(3), 下载(7)
     */
    private Integer exportFlag;

    /**
     * 直播音频链接
     */
    private String exportLink;

    /**
     * 任务类型,0:直播, 1:转播
     */
    private Integer taskType;

    /**
     * 课程创建者(unionId)
     */
    private String createUserUnionId;

    /**
     * 课程创建者(username)
     */
    private String createUserUsername;

    /**
     * 课程创建者昵称, 若创建者被撤销U助手身份时备用
     */
    private String createUserNickname;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 如果课程是从live_task表转入, 则为live_task的id, 反之为NULL
     */
    private Long tid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic == null ? null : topic.trim();
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Long getLiveRoomNum() {
        return liveRoomNum;
    }

    public void setLiveRoomNum(Long liveRoomNum) {
        this.liveRoomNum = liveRoomNum;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTimerImg() {
        return timerImg;
    }

    public void setTimerImg(String timerImg) {
        this.timerImg = timerImg == null ? null : timerImg.trim();
    }

    public Integer getExportFlag() {
        return exportFlag;
    }

    public void setExportFlag(Integer exportFlag) {
        this.exportFlag = exportFlag;
    }

    public String getExportLink() {
        return exportLink;
    }

    public void setExportLink(String exportLink) {
        this.exportLink = exportLink == null ? null : exportLink.trim();
    }

    public Integer getTaskType() {
        return taskType;
    }

    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    public String getCreateUserUnionId() {
        return createUserUnionId;
    }

    public void setCreateUserUnionId(String createUserUnionId) {
        this.createUserUnionId = createUserUnionId == null ? null : createUserUnionId.trim();
    }

    public String getCreateUserUsername() {
        return createUserUsername;
    }

    public void setCreateUserUsername(String createUserUsername) {
        this.createUserUsername = createUserUsername == null ? null : createUserUsername.trim();
    }

    public String getCreateUserNickname() {
        return createUserNickname;
    }

    public void setCreateUserNickname(String createUserNickname) {
        this.createUserNickname = createUserNickname == null ? null : createUserNickname.trim();
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

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }
}