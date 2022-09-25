package com.yanjiang.order.dao;

import com.yanjiang.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author yj
 * @email wuyanjiang321@163.com
 * @date 2022-07-01 21:32:29
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
