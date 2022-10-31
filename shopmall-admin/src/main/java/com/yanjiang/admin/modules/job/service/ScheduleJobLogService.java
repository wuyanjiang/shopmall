package com.yanjiang.admin.modules.job.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yanjiang.admin.common.utils.PageUtils;
import com.yanjiang.admin.modules.job.entity.ScheduleJobLogEntity;

import java.util.Map;

/**
 * 定时任务日志
 *
 * @author yj wuyanjiang321@163.com
 */
public interface ScheduleJobLogService extends IService<ScheduleJobLogEntity> {

	PageUtils queryPage(Map<String, Object> params);
	
}
