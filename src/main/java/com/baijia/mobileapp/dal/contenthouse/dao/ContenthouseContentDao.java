package com.baijia.mobileapp.dal.contenthouse.dao;

import com.baijia.mobileapp.dal.contenthouse.po.ContenthouseContentPo;
import com.baijia.mobileapp.dal.contenthouse.po.ContenthouseContentWithBLOBsPo;

public interface ContenthouseContentDao {
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
    int insert(ContenthouseContentWithBLOBsPo record);

    /**
     *
     * @param record
     */
    int insertSelective(ContenthouseContentWithBLOBsPo record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    ContenthouseContentWithBLOBsPo selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(ContenthouseContentWithBLOBsPo record);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeyWithBLOBs(ContenthouseContentWithBLOBsPo record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(ContenthouseContentPo record);
}