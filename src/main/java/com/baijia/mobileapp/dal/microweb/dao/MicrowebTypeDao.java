package com.baijia.mobileapp.dal.microweb.dao;

import com.baijia.mobileapp.dal.microweb.po.MicrowebTypePo;

public interface MicrowebTypeDao {
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
    int insert(MicrowebTypePo record);

    /**
     *
     * @param record
     */
    int insertSelective(MicrowebTypePo record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    MicrowebTypePo selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(MicrowebTypePo record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(MicrowebTypePo record);
}