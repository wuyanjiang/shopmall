package com.yanjiang.admin.modules.sys.form;

import lombok.Data;

/**
 * 登录表单
 *
 * @author yj wuyanjiang321@163.com
 */
@Data
public class SysLoginForm {
    private String username;
    private String password;
    private String captcha;
    private String uuid;


}
