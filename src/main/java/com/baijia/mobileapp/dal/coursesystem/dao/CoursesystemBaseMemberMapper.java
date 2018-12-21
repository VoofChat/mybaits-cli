package com.baijia.mobileapp.dal.coursesystem.dao;

import com.baijia.mobileapp.dal.coursesystem.po.CoursesystemBaseMemberPO;

public interface CoursesystemBaseMemberMapper {
    /**
     * 根据主键删除数据库的记录
     *
     * @param id
     * @return 
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入数据库记录
     *
     * @param record
     * @return 
     */
    int insert(CoursesystemBaseMemberPO record);

    /**
     * 插入数据库记录
     *
     * @param record
     * @return 
     */
    int insertSelective(CoursesystemBaseMemberPO record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     * @return 
     */
    CoursesystemBaseMemberPO selectByPrimaryKey(Integer id);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     * @return 
     */
    int updateByPrimaryKeySelective(CoursesystemBaseMemberPO record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     * @return 
     */
    int updateByPrimaryKey(CoursesystemBaseMemberPO record);
}