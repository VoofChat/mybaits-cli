package com.baijia.growthbase.dal.contenthouse.dao;

import com.baijia.growthbase.dal.contenthouse.po.CourseLiveDataPo;
import com.baijia.growthbase.dal.contenthouse.po.CourseLiveDataWithBLOBsPo;

public interface CourseLiveDataDao {
    /**
     * 根据主键删除数据库的记录
     *
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insert(CourseLiveDataWithBLOBsPo record);

    /**
     *
     * @param record
     */
    int insertSelective(CourseLiveDataWithBLOBsPo record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    CourseLiveDataWithBLOBsPo selectByPrimaryKey(Long id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(CourseLiveDataWithBLOBsPo record);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeyWithBLOBs(CourseLiveDataWithBLOBsPo record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(CourseLiveDataPo record);
}