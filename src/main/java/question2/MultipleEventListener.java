package question2;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;

public class MultipleEventListener{

    @EventListener(ContextStartedEvent.class)
    void start(){
        System.out.println("----------Listener---------- Started");
    }
    @EventListener(ContextStoppedEvent.class)
    void stop(){
        System.out.println("----------Listener---------- Stopped");
    }
    @EventListener(ContextClosedEvent.class)
    void close(){
        System.out.println("----------Listener---------- Closed");
    }
}
