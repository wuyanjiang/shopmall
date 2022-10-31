package com.yanjiang.admin.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yanjiang.admin.common.utils.PageUtils;
import com.yanjiang.admin.modules.sys.entity.SysRoleEntity;

import java.util.List;
import java.util.Map;


/**
 * 角色
 *
 * @author yj wuyanjiang321@163.com
 */
public interface SysRoleService extends IService<SysRoleEntity> {

	PageUtils queryPage(Map<String, Object> params);

	void saveRole(SysRoleEntity role);

	void update(SysRoleEntity role);

	void deleteBatch(Long[] roleIds);

	
	/**
	 * 查询用户创建的角色ID列表
	 */
	List<Long> queryRoleIdList(Long createUserId);
}
