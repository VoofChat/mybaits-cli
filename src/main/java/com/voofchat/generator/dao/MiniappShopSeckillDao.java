package com.voofchat.generator.dao;

import com.voofchat.generator.po.MiniappShopSeckillExamplePo;
import com.voofchat.generator.po.MiniappShopSeckillPo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniappShopSeckillDao {
    /**
     *
     * @param example
     */
    int countByExample(MiniappShopSeckillExamplePo example);

    /**
     *
     * @param example
     */
    int deleteByExample(MiniappShopSeckillExamplePo example);

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
     *
     * @param example
     */
    List<MiniappShopSeckillPo> selectByExample(MiniappShopSeckillExamplePo example);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param seckillId
     */
    MiniappShopSeckillPo selectByPrimaryKey(Long seckillId);

    /**
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") MiniappShopSeckillPo record, @Param("example") MiniappShopSeckillExamplePo example);

    /**
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") MiniappShopSeckillPo record, @Param("example") MiniappShopSeckillExamplePo example);

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