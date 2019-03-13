package question1;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("Spring-config.xml");
        Database database=(Database) applicationContext.getBean("database");
        System.out.println("Name:"+database.name+"\n Port :"+database.port);

        applicationContext.start();
        applicationContext.stop();
        applicationContext.close();
    }
}
