package com.baijia.mobileapp.dal.assist.dao;

import com.baijia.mobileapp.dal.assist.po.MobileappAssistOrderPo;

public interface MobileappAssistOrderDao {
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
    int insert(MobileappAssistOrderPo record);

    /**
     *
     * @param record
     */
    int insertSelective(MobileappAssistOrderPo record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    MobileappAssistOrderPo selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(MobileappAssistOrderPo record);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeyWithBLOBs(MobileappAssistOrderPo record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(MobileappAssistOrderPo record);
}