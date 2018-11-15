package com.baijia.mobileapp.dal.assist.dao;

import com.baijia.mobileapp.dal.assist.po.CoursesystemAssistSpecPo;

public interface CoursesystemAssistSpecDao {
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
    int insert(CoursesystemAssistSpecPo record);

    /**
     *
     * @param record
     */
    int insertSelective(CoursesystemAssistSpecPo record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    CoursesystemAssistSpecPo selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(CoursesystemAssistSpecPo record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(CoursesystemAssistSpecPo record);
}