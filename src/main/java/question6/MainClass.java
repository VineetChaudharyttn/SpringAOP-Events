package question6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Spring-config.xml");
        ClassThrowable classThrowable=applicationContext.getBean(ClassThrowable.class);
        try {
            classThrowable.hello();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
