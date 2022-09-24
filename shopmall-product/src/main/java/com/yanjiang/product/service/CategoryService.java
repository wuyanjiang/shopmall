package com.yanjiang.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yanjiang.product.entity.CategoryEntity;
import com.yanjiang.common.utils.PageUtils;
import com.yanjiang.product.vo.Catelog2Vo;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author yj
 * @email wuyanjiang321@163.com
 * @date 2022-06-30 21:01:45
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();

    void removeMenuByIds(List<Long> asList);


    /**
     * 找到catelogId的完整路径；
     * [父/子/孙]
     * @param catelogId
     * @return
     */
    Long[] findCatelogPath(Long catelogId);

    void updateCascade(CategoryEntity category);


    List<CategoryEntity> getLevel1Categorys();


    Map<String, List<Catelog2Vo>> getCatalogJson();

    Map<String, List<Catelog2Vo>> getCatalogJson2();

    List<CategoryEntity> categorylist();
}

