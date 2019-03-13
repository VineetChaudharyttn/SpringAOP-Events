package question8;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class pointCutAdvise {


    @Pointcut("execution(void show())")
    void showPointcut(){}

    @After("showPointcut()")
    void afterAdvice(){
        System.out.println("-----Running after advice-----");
    }

    @Before("showPointcut()")
    void beforeAdvice(){
        System.out.println("-----Running before advice-----");
    }


}
