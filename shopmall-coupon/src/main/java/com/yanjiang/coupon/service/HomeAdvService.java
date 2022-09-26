package com.yanjiang.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yanjiang.common.utils.PageUtils;
import com.yanjiang.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author yj
 * @email wuyanjiang321@163.com
 * @date 2022-07-01 22:43:29
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

