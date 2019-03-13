package question9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Spring-config.xml");
        MethodToJoinPoint methodToJoinPoint=applicationContext.getBean(MethodToJoinPoint.class);
        methodToJoinPoint.joinPoint("Testing");
    }
}
