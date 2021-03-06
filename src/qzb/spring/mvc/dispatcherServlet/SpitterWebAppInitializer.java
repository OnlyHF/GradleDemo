package qzb.spring.mvc.dispatcherServlet;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//public class SpitterWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
public class SpitterWebAppInitializer {
        /**
     * 将DispatcherServlet映射到"/"
     * @return
     */
    protected String[] getServletMappings() {
        return new String[]{ "/" };
    }

    /**
     *
     * @return
     */
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { RootConfig.class };
    }

    /**
     * 指定配置类
     * @return
     */
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{ WebConfig.class };
    }
}
