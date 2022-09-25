package com.yanjiang.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yanjiang.common.utils.PageUtils;
import com.yanjiang.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author yj
 * @email wuyanjiang321@163.com
 * @date 2022-07-01 21:32:29
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

