package com.yanjiang.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yanjiang.common.utils.PageUtils;
import com.yanjiang.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author yj
 * @email wuyanjiang321@163.com
 * @date 2022-07-01 22:43:29
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

