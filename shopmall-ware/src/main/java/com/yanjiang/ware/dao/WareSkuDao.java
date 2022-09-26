package com.yanjiang.ware.dao;

import com.yanjiang.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author yj
 * @email wuyanjiang321@163.com
 * @date 2022-07-01 22:32:37
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
