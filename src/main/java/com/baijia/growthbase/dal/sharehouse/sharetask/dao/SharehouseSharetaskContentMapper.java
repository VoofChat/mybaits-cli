package com.baijia.growthbase.dal.sharehouse.sharetask.dao;

import com.baijia.growthbase.dal.sharehouse.sharetask.po.SharehouseSharetaskContentPO;

public interface SharehouseSharetaskContentMapper {
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
    int insert(SharehouseSharetaskContentPO record);

    /**
     * 插入数据库记录
     *
     * @param record
     * @return 
     */
    int insertSelective(SharehouseSharetaskContentPO record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     * @return 
     */
    SharehouseSharetaskContentPO selectByPrimaryKey(Integer id);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     * @return 
     */
    int updateByPrimaryKeySelective(SharehouseSharetaskContentPO record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     * @return 
     */
    int updateByPrimaryKey(SharehouseSharetaskContentPO record);
}