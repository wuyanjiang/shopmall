package com.yanjiang.product.feign;

import com.yanjiang.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient("shopmall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/list")
    public R couponList(@RequestParam Map<String, Object> params);
}
