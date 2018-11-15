package com.baijia.growthbase.dal.contenthouse.dao;

import com.baijia.growthbase.dal.contenthouse.po.ContenthouseAuthorityPo;

public interface ContenthouseAuthorityDao {
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
    int insert(ContenthouseAuthorityPo record);

    /**
     *
     * @param record
     */
    int insertSelective(ContenthouseAuthorityPo record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    ContenthouseAuthorityPo selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(ContenthouseAuthorityPo record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(ContenthouseAuthorityPo record);
}