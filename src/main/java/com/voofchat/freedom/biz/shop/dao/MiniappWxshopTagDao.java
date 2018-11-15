package com.voofchat.freedom.biz.shop.dao;

import com.voofchat.freedom.biz.shop.entity.po.MiniappWxshopTagPo;

public interface MiniappWxshopTagDao {
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
    int insert(MiniappWxshopTagPo record);

    /**
     *
     * @param record
     */
    int insertSelective(MiniappWxshopTagPo record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    MiniappWxshopTagPo selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(MiniappWxshopTagPo record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(MiniappWxshopTagPo record);
}