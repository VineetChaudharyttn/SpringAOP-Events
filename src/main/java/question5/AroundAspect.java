package question5;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AroundAspect {
    @Around("execution(* display(..))")
    void aroundLog(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("---------Aspect Before--------");
        joinPoint.proceed();
        System.out.println("---------Aspect After--------");
    }
}
