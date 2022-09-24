package com.yanjiang.product.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.yanjiang.product.entity.CategoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yanjiang.product.service.CategoryService;
import com.yanjiang.common.utils.PageUtils;
import com.yanjiang.common.utils.R;



/**
 * 商品三级分类
 *
 * @author yj
 * @email wuyanjiang321@163.com
 * @date 2022-06-30 21:01:45
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;


    /**
     * 树形列表
     */
    @RequestMapping("/tree")
    public R tree(){
        List<CategoryEntity> categorylist= categoryService.categorylist();
        return R.ok().put("data", categorylist);
    }

    /**
     * 树形列表
     */
    @RequestMapping("/getCatalogJson")
    public R getCatalogJson(){
        return R.ok().put("data", categoryService.getCatalogJson2());
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = categoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    public R info(@PathVariable("catId") Long catId){
		CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("category", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CategoryEntity category){
		categoryService.save(category);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CategoryEntity category){
		categoryService.updateById(category);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] catIds){
		categoryService.removeByIds(Arrays.asList(catIds));

        return R.ok();
    }

}
