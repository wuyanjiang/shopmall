package com.yanjiang.admin.modules.sys.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yanjiang.admin.modules.sys.entity.SysLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统日志
 *
 * @author yj wuyanjiang321@163.com
 */
@Mapper
public interface SysLogDao extends BaseMapper<SysLogEntity> {
	
}
