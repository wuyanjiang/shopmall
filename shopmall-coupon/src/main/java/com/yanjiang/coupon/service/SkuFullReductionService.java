package com.yanjiang.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yanjiang.common.utils.PageUtils;
import com.yanjiang.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author yj
 * @email wuyanjiang321@163.com
 * @date 2022-07-01 22:43:30
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

