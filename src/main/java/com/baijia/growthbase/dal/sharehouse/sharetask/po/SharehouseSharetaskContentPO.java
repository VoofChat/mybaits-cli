package com.baijia.growthbase.dal.sharehouse.sharetask.po;

import java.util.Date;
import lombok.Data;

/**
 * 实体SharehouseSharetaskContentPO对应数据库表rp_sharehouse_sharetask_content
 * 
 * @author: 郑志雄
 * @email: zhengzhixiong@baijiahulian.com
 * @date: 2018年12月19 10:28
 * @description: 
 */
@Data
public class SharehouseSharetaskContentPO {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 公众号appId
     */
    private String appId;

    /**
     * 公众号名称
     */
    private String appName;

    /**
     * 是否显示服务号
     */
    private Boolean isShowApp;

    /**
     * U群账户id
     */
    private Integer accountId;

    /**
     * 页面标题
     */
    private String title;

    /**
     * 海报图片链接
     */
    private String postUrl;

    /**
     * 附件内容地址，如视频，音频等等
     */
    private String file;

    /**
     * 转发卡片json
     */
    private String forwardCard;

    /**
     * 跳转链接
     */
    private String redirectUrl;

    /**
     * 跳转要求
     */
    private String redirectRequire;

    /**
     * 首页按钮文案
     */
    private String indexBtnTitle;

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
}