package com.qzb.dispatcherServlet;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class TestDispatcherServletInittializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * 将 DispatcherServlet 映射到 "/"
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/home.do", "/hello.do" };
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { RootConfig.class };
    }

    /**
     * 指定配置类
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { WebConfig.class };
    }

}
