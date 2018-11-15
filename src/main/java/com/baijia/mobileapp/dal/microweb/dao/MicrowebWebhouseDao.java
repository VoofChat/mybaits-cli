package com.baijia.mobileapp.dal.microweb.dao;

import com.baijia.mobileapp.dal.microweb.po.MicrowebWebhousePo;

public interface MicrowebWebhouseDao {
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
    int insert(MicrowebWebhousePo record);

    /**
     *
     * @param record
     */
    int insertSelective(MicrowebWebhousePo record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    MicrowebWebhousePo selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(MicrowebWebhousePo record);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeyWithBLOBs(MicrowebWebhousePo record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(MicrowebWebhousePo record);
}