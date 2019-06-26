package com.wangyuelin.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 描述:自定义资源映射和页面跳转
 *
 * @outhor wangyuelin
 * @create 2018-06-21 下午5:56
 */
public class MyWebMvcConfigurerAdapter extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //将dlzmovie下的资源请求映射到/static/html/下
//        registry.addResourceHandler("/dlzmovie/**").addResourceLocations("classpath:/static/html/");
        super.addResourceHandlers(registry);
    }
}