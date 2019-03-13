package question1;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class Listener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("----------Listener----------");
    }
}
