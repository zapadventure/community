package com.nowcoder.community.config;

import com.nowcoder.community.controller.interceptor.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author superzap
 * @create 2022-09-17 18:00
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    private AlphaInterceptor alphaInterceptor;

    @Autowired
    private LoginTicketInterceptor loginTicketInterceptor;

//    @Autowired
//    private LoginRequiredInterceptor requiredInterceptor;

    @Autowired
    private MessageInterceptor messageInterceptor;

    @Autowired
    private DataInterceptor dataInterceptor;

    /**
     * 添加拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(alphaInterceptor).excludePathPatterns("/**/*.css","/**/*.js",
                "/**/*.png","/**/*.jpg","/**/*.jpeg").addPathPatterns("/register","/login");

        registry.addInterceptor(loginTicketInterceptor).excludePathPatterns("/**/*.css","/**/*.js",
                "/**/*.png","/**/*.jpg","/**/*.jpeg");

//        registry.addInterceptor(requiredInterceptor).excludePathPatterns("/**/*.css","/**/*.js",
//                "/**/*.png","/**/*.jpg","/**/*.jpeg");

        registry.addInterceptor(messageInterceptor).excludePathPatterns("/**/*.css","/**/*.js",
                "/**/*.png","/**/*.jpg","/**/*.jpeg");

        registry.addInterceptor(dataInterceptor).excludePathPatterns("/**/*.css","/**/*.js",
                "/**/*.png","/**/*.jpg","/**/*.jpeg");
    }
}
