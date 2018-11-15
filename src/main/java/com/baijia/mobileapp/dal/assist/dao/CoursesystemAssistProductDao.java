package com.baijia.mobileapp.dal.assist.dao;

import com.baijia.mobileapp.dal.assist.po.CoursesystemAssistProductPo;
import com.baijia.mobileapp.dal.assist.po.CoursesystemAssistProductWithBLOBsPo;

public interface CoursesystemAssistProductDao {
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
    int insert(CoursesystemAssistProductWithBLOBsPo record);

    /**
     *
     * @param record
     */
    int insertSelective(CoursesystemAssistProductWithBLOBsPo record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    CoursesystemAssistProductWithBLOBsPo selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(CoursesystemAssistProductWithBLOBsPo record);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeyWithBLOBs(CoursesystemAssistProductWithBLOBsPo record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(CoursesystemAssistProductPo record);
}