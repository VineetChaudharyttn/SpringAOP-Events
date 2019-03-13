package question4;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Before("execution(* question4.Services.*(..))")
    public void beforeAdvice(){
        System.out.println("------Aspect for all service------");
    }

}
