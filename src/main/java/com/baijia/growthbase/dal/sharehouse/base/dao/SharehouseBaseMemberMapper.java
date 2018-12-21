package com.baijia.growthbase.dal.sharehouse.base.dao;

import com.baijia.growthbase.dal.sharehouse.base.po.SharehouseBaseMemberPO;

public interface SharehouseBaseMemberMapper {
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
    int insert(SharehouseBaseMemberPO record);

    /**
     * 插入数据库记录
     *
     * @param record
     * @return 
     */
    int insertSelective(SharehouseBaseMemberPO record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     * @return 
     */
    SharehouseBaseMemberPO selectByPrimaryKey(Integer id);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     * @return 
     */
    int updateByPrimaryKeySelective(SharehouseBaseMemberPO record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     * @return 
     */
    int updateByPrimaryKey(SharehouseBaseMemberPO record);
}