package com.baijia.growthbase.dal.microweb.dao;

import com.baijia.growthbase.dal.microweb.po.MicrowebModulePo;

public interface MicrowebModuleDao {
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
    int insert(MicrowebModulePo record);

    /**
     *
     * @param record
     */
    int insertSelective(MicrowebModulePo record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    MicrowebModulePo selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(MicrowebModulePo record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(MicrowebModulePo record);
}