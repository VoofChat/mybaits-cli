package com.baijia.mobileapp.dal.microweb.dao;

import com.baijia.mobileapp.dal.microweb.po.MicrowebWebpagePo;

public interface MicrowebWebpageDao {
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
    int insert(MicrowebWebpagePo record);

    /**
     *
     * @param record
     */
    int insertSelective(MicrowebWebpagePo record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    MicrowebWebpagePo selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(MicrowebWebpagePo record);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeyWithBLOBs(MicrowebWebpagePo record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(MicrowebWebpagePo record);
}