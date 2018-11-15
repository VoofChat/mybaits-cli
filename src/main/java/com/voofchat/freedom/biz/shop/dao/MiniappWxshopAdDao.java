package com.voofchat.freedom.biz.shop.dao;

import com.voofchat.freedom.biz.shop.entity.po.MiniappWxshopAdPo;

public interface MiniappWxshopAdDao {
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
    int insert(MiniappWxshopAdPo record);

    /**
     *
     * @param record
     */
    int insertSelective(MiniappWxshopAdPo record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    MiniappWxshopAdPo selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(MiniappWxshopAdPo record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(MiniappWxshopAdPo record);
}