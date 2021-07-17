package com.kyel.config;

import com.kyel.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author jiewang
 */
@Configuration
public class WebConfiguration implements WebMvcConfigurer {
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        LoginInterceptor loginInterceptor = new LoginInterceptor();
//        registry.addInterceptor(loginInterceptor).addPathPatterns("/**").excludePathPatterns("/","/login","/css/**","/fonts/**","/images/**","/js/**");
//    }
}
