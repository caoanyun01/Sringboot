package com.mengke;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.mengke.util.LoginInteceptor;

/**
 * 拦截器的规则
 * SpringMvcWebAppConfigurer<br/>
 * 创建人:曾翔<br/>
 * 时间：2017年11月2日-上午10:25:10 <br/>
 * @version 1.0.0<br/>
 *
 */
@Configuration
public class SpringMvcWebAppConfigurer  extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(new LoginInteceptor())
        .addPathPatterns("/admin/**");
    }
    

}