package com.yanjiang.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yanjiang.product.entity.AttrEntity;
import com.yanjiang.common.utils.PageUtils;

import java.util.Map;

/**
 * 商品属性
 *
 * @author yj
 * @email wuyanjiang321@163.com
 * @date 2022-06-30 21:01:46
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

