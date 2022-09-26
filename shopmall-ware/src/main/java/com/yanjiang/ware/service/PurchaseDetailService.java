package com.yanjiang.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yanjiang.common.utils.PageUtils;
import com.yanjiang.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author yj
 * @email wuyanjiang321@163.com
 * @date 2022-07-01 22:32:37
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

