package com.baijia.mobileapp.dal.microweb.dao;

import com.baijia.mobileapp.dal.microweb.po.CoursesystemBaseOrderPo;

public interface CoursesystemBaseOrderDao {
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
    int insert(CoursesystemBaseOrderPo record);

    /**
     *
     * @param record
     */
    int insertSelective(CoursesystemBaseOrderPo record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    CoursesystemBaseOrderPo selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(CoursesystemBaseOrderPo record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(CoursesystemBaseOrderPo record);
}