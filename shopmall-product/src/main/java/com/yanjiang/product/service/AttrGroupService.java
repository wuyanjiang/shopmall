package com.yanjiang.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yanjiang.product.entity.AttrGroupEntity;
import com.yanjiang.common.utils.PageUtils;

import java.util.Map;

/**
 * 属性分组
 *
 * @author yj
 * @email wuyanjiang321@163.com
 * @date 2022-06-30 21:01:45
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

