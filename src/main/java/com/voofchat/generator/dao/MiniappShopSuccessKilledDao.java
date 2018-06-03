package com.voofchat.generator.dao;

import com.voofchat.generator.po.MiniappShopSuccessKilledExamplePo;
import com.voofchat.generator.po.MiniappShopSuccessKilledKeyPo;
import com.voofchat.generator.po.MiniappShopSuccessKilledPo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniappShopSuccessKilledDao {
    /**
     *
     * @param example
     */
    int countByExample(MiniappShopSuccessKilledExamplePo example);

    /**
     *
     * @param example
     */
    int deleteByExample(MiniappShopSuccessKilledExamplePo example);

    /**
     * 根据主键删除数据库的记录
     *
     * @param key
     */
    int deleteByPrimaryKey(MiniappShopSuccessKilledKeyPo key);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insert(MiniappShopSuccessKilledPo record);

    /**
     *
     * @param record
     */
    int insertSelective(MiniappShopSuccessKilledPo record);

    /**
     *
     * @param example
     */
    List<MiniappShopSuccessKilledPo> selectByExample(MiniappShopSuccessKilledExamplePo example);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param key
     */
    MiniappShopSuccessKilledPo selectByPrimaryKey(MiniappShopSuccessKilledKeyPo key);

    /**
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") MiniappShopSuccessKilledPo record, @Param("example") MiniappShopSuccessKilledExamplePo example);

    /**
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") MiniappShopSuccessKilledPo record, @Param("example") MiniappShopSuccessKilledExamplePo example);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(MiniappShopSuccessKilledPo record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(MiniappShopSuccessKilledPo record);
}