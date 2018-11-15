package com.voofchat.freedom.biz.shop.dao;

import com.voofchat.freedom.biz.shop.entity.po.MiniappWxshopTopicPo;

public interface MiniappWxshopTopicDao {
    /**
     * 根据主键删除数据库的记录
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insert(MiniappWxshopTopicPo record);

    /**
     *
     * @param record
     */
    int insertSelective(MiniappWxshopTopicPo record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    MiniappWxshopTopicPo selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(MiniappWxshopTopicPo record);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeyWithBLOBs(MiniappWxshopTopicPo record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(MiniappWxshopTopicPo record);
}