package com.absurd.summer.annotation;

import java.lang.annotation.*;

/**
 * @author wangwenwei
 * @time 2018/3/9
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Component
public @interface Controller {
    String value() default "";
}
