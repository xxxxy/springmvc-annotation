package com.john;

import com.john.config.AppConfig;
import com.john.config.RootConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    /**
     * 获取根容器的配置类（Spring的配置文件），也就是父容器
     *
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("加载根配置");
        return new Class[]{RootConfig.class};
    }

    /**
     * 获取web容器的配置类（Spring MVC的配置文件），也就是子容器
     *
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("加载Spring mvc配置");
        return new Class[]{AppConfig.class};
    }

    /**
     * 获取DispatchServlet的映射信息
     *  / :拦截所有请求（包括，js,图片），但是不包括*.jsp
     *  /* : 拦截所有请求，包括*.jsp
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
