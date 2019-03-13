package question9;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class JoinPointAdvice {

    @Before("execution(Integer *(..))")
    void testJoinPoint(JoinPoint joinPoint){
        System.out.println("------Before JoinPoint--------");
        System.out.println(joinPoint.getKind());
        System.out.println(joinPoint.getSignature());
        System.out.println(joinPoint.getThis());
    }
}
