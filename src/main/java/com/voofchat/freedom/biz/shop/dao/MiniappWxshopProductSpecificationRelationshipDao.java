package com.voofchat.freedom.biz.shop.dao;

import com.voofchat.freedom.biz.shop.entity.po.MiniappWxshopProductSpecificationRelationshipPo;

public interface MiniappWxshopProductSpecificationRelationshipDao {
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
    int insert(MiniappWxshopProductSpecificationRelationshipPo record);

    /**
     *
     * @param record
     */
    int insertSelective(MiniappWxshopProductSpecificationRelationshipPo record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    MiniappWxshopProductSpecificationRelationshipPo selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(MiniappWxshopProductSpecificationRelationshipPo record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(MiniappWxshopProductSpecificationRelationshipPo record);
}