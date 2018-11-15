package com.voofchat.freedom.biz.shop.dao;

import com.voofchat.freedom.biz.shop.entity.po.MiniappWxshopOrderitemPo;

public interface MiniappWxshopOrderitemDao {
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
    int insert(MiniappWxshopOrderitemPo record);

    /**
     *
     * @param record
     */
    int insertSelective(MiniappWxshopOrderitemPo record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    MiniappWxshopOrderitemPo selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(MiniappWxshopOrderitemPo record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(MiniappWxshopOrderitemPo record);
}