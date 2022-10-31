package com.yanjiang.admin.modules.job.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yanjiang.admin.modules.job.entity.ScheduleJobLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务日志
 *
 * @author yj wuyanjiang321@163.com
 */
@Mapper
public interface ScheduleJobLogDao extends BaseMapper<ScheduleJobLogEntity> {
	
}
