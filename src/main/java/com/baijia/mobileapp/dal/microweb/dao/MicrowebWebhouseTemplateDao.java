package com.baijia.mobileapp.dal.microweb.dao;

import com.baijia.mobileapp.dal.microweb.po.MicrowebWebhouseTemplatePo;

public interface MicrowebWebhouseTemplateDao {
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
    int insert(MicrowebWebhouseTemplatePo record);

    /**
     *
     * @param record
     */
    int insertSelective(MicrowebWebhouseTemplatePo record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    MicrowebWebhouseTemplatePo selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(MicrowebWebhouseTemplatePo record);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeyWithBLOBs(MicrowebWebhouseTemplatePo record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(MicrowebWebhouseTemplatePo record);
}