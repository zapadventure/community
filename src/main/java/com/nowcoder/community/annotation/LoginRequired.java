package com.nowcoder.community.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用来限制访问(登录)和范围
 * 只用来标记，无需写内容
 * @author superzap
 * @create 2022-09-18 13:48
 */
@Target(ElementType.METHOD) //该注解写在方法上面,用来描述方法
@Retention(RetentionPolicy.RUNTIME) //程序运行时才有效
public @interface LoginRequired {
}
