package com.yanjiang.admin.modules.app.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.yanjiang.admin.modules.app.form.LoginForm;
import com.yanjiang.admin.modules.app.entity.UserEntity;

/**
 * 用户
 *
 * @author yj wuyanjiang321@163.com
 */
public interface UserService extends IService<UserEntity> {

	UserEntity queryByMobile(String mobile);

	/**
	 * 用户登录
	 * @param form    登录表单
	 * @return        返回用户ID
	 */
	long login(LoginForm form);
}
