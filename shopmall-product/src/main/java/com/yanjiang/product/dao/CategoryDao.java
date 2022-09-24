package com.yanjiang.product.dao;

import com.yanjiang.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yj
 * @email wuyanjiang321@163.com
 * @date 2022-06-30 21:01:45
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
