package com.yanjiang.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yanjiang.product.entity.SkuInfoEntity;
import com.yanjiang.common.utils.PageUtils;

import java.util.Map;

/**
 * sku信息
 *
 * @author yj
 * @email wuyanjiang321@163.com
 * @date 2022-06-30 21:01:45
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

