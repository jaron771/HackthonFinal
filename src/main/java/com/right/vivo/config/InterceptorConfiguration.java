package com.right.vivo.config;

import com.right.vivo.Interceptor.LogInInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author DW
 * @date 2019/5/27
 */
@Configuration
public class InterceptorConfiguration implements WebMvcConfigurer {
    public static final String SESSION_KEY = "user";

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LogInInterceptor()).excludePathPatterns("/user/login", "/login", "/index", "/signUp", "/register", "/error", "/**/*.css", "/**/*.js", "/**/*.png", "/**/*.gif ", "/**/*.jpg", "/**/*.jpeg ", "/font/**", "/user/register").addPathPatterns("/**");
    }
}
