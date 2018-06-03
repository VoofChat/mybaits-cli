package org.seckill.dao;

import org.seckill.po.MiniappShopSeckillPo;

public interface MiniappShopSeckillDao {
    /**
     * 根据主键删除数据库的记录
     *
     * @param seckillId
     */
    int deleteByPrimaryKey(Long seckillId);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insert(MiniappShopSeckillPo record);

    /**
     *
     * @param record
     */
    int insertSelective(MiniappShopSeckillPo record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param seckillId
     */
    MiniappShopSeckillPo selectByPrimaryKey(Long seckillId);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(MiniappShopSeckillPo record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(MiniappShopSeckillPo record);
}