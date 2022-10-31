package com.yanjiang.admin.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yanjiang.admin.modules.sys.entity.SysUserTokenEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统用户Token
 *
 * @author yj wuyanjiang321@163.com
 */
@Mapper
public interface SysUserTokenDao extends BaseMapper<SysUserTokenEntity> {

    SysUserTokenEntity queryByToken(String token);
	
}
