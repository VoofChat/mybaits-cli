package com.baijia.growthbase.dal.microweb.dao;

import com.baijia.growthbase.dal.microweb.po.MicrowebModulePO;

public interface MicrowebModuleMapper {
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
    int insert(MicrowebModulePO record);

    /**
     * 插入数据库记录
     *
     * @param record
     * @return 
     */
    int insertSelective(MicrowebModulePO record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     * @return 
     */
    MicrowebModulePO selectByPrimaryKey(Integer id);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     * @return 
     */
    int updateByPrimaryKeySelective(MicrowebModulePO record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     * @return 
     */
    int updateByPrimaryKey(MicrowebModulePO record);
}