package com.yanjiang.admin.modules.oss.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yanjiang.admin.modules.oss.entity.SysOssEntity;
import com.yanjiang.admin.common.utils.PageUtils;

import java.util.Map;

/**
 * 文件上传
 *
 * @author yj wuyanjiang321@163.com
 */
public interface SysOssService extends IService<SysOssEntity> {

	PageUtils queryPage(Map<String, Object> params);
}
