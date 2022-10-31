package com.yanjiang.admin.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yanjiang.admin.common.utils.R;
import com.yanjiang.admin.modules.sys.entity.SysUserTokenEntity;

/**
 * 用户Token
 *
 * @author yj wuyanjiang321@163.com
 */
public interface SysUserTokenService extends IService<SysUserTokenEntity> {

	/**
	 * 生成token
	 * @param userId  用户ID
	 */
	R createToken(long userId);

	/**
	 * 退出，修改token值
	 * @param userId  用户ID
	 */
	void logout(long userId);

}
