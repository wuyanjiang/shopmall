package com.yanjiang.order.dao;

import com.yanjiang.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author yj
 * @email wuyanjiang321@163.com
 * @date 2022-07-01 21:32:29
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
