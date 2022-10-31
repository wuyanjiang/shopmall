package com.yanjiang.admin.datasource.annotation;

import java.lang.annotation.*;

/**
 * 多数据源注解
 *
 * @author yj wuyanjiang321@163.com
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface DataSource {
    String value() default "";
}
