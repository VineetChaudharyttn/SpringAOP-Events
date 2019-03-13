package question6;


import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.net.URL;

@Component
@Aspect
public class AspectThroable {

    @AfterThrowing(pointcut = "execution(* *())",throwing = "ex")
    void afterThrowingEx(Exception ex){
        System.out.println("Aspect throable Execption "+ex);
    }
}
