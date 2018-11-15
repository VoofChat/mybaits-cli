package com.baijia.mobileapp.dal.assist.dao;

import com.baijia.mobileapp.dal.assist.po.MobileappAssistActivityPo;

public interface MobileappAssistActivityDao {
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
    int insert(MobileappAssistActivityPo record);

    /**
     *
     * @param record
     */
    int insertSelective(MobileappAssistActivityPo record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    MobileappAssistActivityPo selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(MobileappAssistActivityPo record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(MobileappAssistActivityPo record);
}