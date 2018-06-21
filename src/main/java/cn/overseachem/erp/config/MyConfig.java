package cn.overseachem.erp.config;

import cn.overseachem.erp.interceptor.LoginInterceptor;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Zhihui_Shen on 2018/6/4.
 */
@SpringBootConfiguration
public class MyConfig extends WebMvcConfigurerAdapter{

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new LoginInterceptor())
//                .addPathPatterns("/login/2index").addPathPatterns("/market/2purchaseOrderList");
//    }
}
