package com.baijia.growthbase.dal.contenthouse.dao;

import com.baijia.growthbase.dal.contenthouse.po.CourseLiveTaskPo;

public interface CourseLiveTaskDao {
    /**
     * 根据主键删除数据库的记录
     *
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insert(CourseLiveTaskPo record);

    /**
     *
     * @param record
     */
    int insertSelective(CourseLiveTaskPo record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    CourseLiveTaskPo selectByPrimaryKey(Long id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(CourseLiveTaskPo record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(CourseLiveTaskPo record);
}