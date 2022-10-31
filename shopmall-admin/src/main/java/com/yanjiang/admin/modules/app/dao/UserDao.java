package com.yanjiang.admin.modules.app.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yanjiang.admin.modules.app.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户
 *
 * @author yj wuyanjiang321@163.com
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {

}
