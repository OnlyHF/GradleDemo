package test.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
//        FileSystemXmlApplicationContext context = new
//                FileSystemXmlApplicationContext("file:/Users/qianzhubing/Downloads/workspace/GradleDemo/SpringMVC/web/web.WEB-INF/applicationContext.xml");

        ApplicationContext ac = new ClassPathXmlApplicationContext("web/WEB-INF/applicationContext.xml");
//        ((ClassPathXmlApplicationContext)appContext).close();?
    }

}
