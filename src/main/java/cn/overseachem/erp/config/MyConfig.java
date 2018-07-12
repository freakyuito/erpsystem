package cn.overseachem.erp.config;

import cn.overseachem.erp.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Zhihui_Shen on 2018/6/4.
 */
@SpringBootConfiguration
public class MyConfig extends WebMvcConfigurerAdapter {

    @Bean   //把我们的拦截器注入为bean
    public HandlerInterceptor getMyInterceptor() {
        return new LoginInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getMyInterceptor())
                .addPathPatterns("/home/*").addPathPatterns("/market/*").addPathPatterns("/product/*");
    }
}
