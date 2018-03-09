package com.absurd.summer.annotation;

import java.lang.annotation.*;

/**
 * @author wangwenwei
 * @time 2018/3/9
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Mapping
public @interface RequestMapping {
    String value() default "";
}
