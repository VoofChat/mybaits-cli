package com.baijia.growthbase.dal.contenthouse.dao;

import com.baijia.growthbase.dal.contenthouse.po.ContenthouseContentPo;

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
    int insert(ContenthouseContentPo record);

    /**
     *
     * @param record
     */
    int insertSelective(ContenthouseContentPo record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    ContenthouseContentPo selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(ContenthouseContentPo record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(ContenthouseContentPo record);
}