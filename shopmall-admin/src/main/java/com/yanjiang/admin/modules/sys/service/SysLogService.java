package com.yanjiang.admin.modules.sys.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.yanjiang.admin.common.utils.PageUtils;
import com.yanjiang.admin.modules.sys.entity.SysLogEntity;

import java.util.Map;


/**
 * 系统日志
 *
 * @author yj wuyanjiang321@163.com
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
