package com.yanjiang.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yanjiang.common.utils.PageUtils;
import com.yanjiang.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author yj
 * @email wuyanjiang321@163.com
 * @date 2022-07-01 22:43:30
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

