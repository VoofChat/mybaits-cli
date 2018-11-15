package com.baijia.mobileapp.dal.assist.dao;

import com.baijia.mobileapp.dal.assist.po.MobileappAssistMemberPo;

public interface MobileappAssistMemberDao {
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
    int insert(MobileappAssistMemberPo record);

    /**
     *
     * @param record
     */
    int insertSelective(MobileappAssistMemberPo record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    MobileappAssistMemberPo selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(MobileappAssistMemberPo record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(MobileappAssistMemberPo record);
}