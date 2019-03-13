package question8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Spring-config.xml");
        MethodToPointCut methodToPointCut=applicationContext.getBean(MethodToPointCut.class);
        methodToPointCut.show();
    }
}
