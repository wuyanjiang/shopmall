package com.yanjiang.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yanjiang.common.utils.PageUtils;
import com.yanjiang.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author yj
 * @email wuyanjiang321@163.com
 * @date 2022-07-01 22:43:29
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

