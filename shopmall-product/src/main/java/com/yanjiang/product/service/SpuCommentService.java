package com.yanjiang.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yanjiang.product.entity.SpuCommentEntity;
import com.yanjiang.common.utils.PageUtils;

import java.util.Map;

/**
 * 商品评价
 *
 * @author yj
 * @email wuyanjiang321@163.com
 * @date 2022-06-30 21:01:45
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

