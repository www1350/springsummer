package com.absurd.summer.annotation;

import java.lang.annotation.*;

/**
 * @author wangwenwei
 * @time 2018/3/9
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestParam {
    /**
     * 表示参数的别名，必填
     * @return
     */
    String value();
}
