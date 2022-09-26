package com.yanjiang.coupon.dao;

import com.yanjiang.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author yj
 * @email wuyanjiang321@163.com
 * @date 2022-07-01 22:43:30
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
