package question7;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectForExpresions {
    @Before("execution(void test(..))")
    void beforeAspect(){
        System.out.println("---Before execution Aspect---");
    }

    @After("execution(void test(..))")
    void afterAspect(){
        System.out.println("---After execution Aspect---");
    }

    @Before("within(question7.Demo)")
    void withinBeforeAspect(){
        System.out.println("---Before within Aspect---");
    }

    @After("within(question7.Demo)")
    void withinAfterAspect(){
        System.out.println("---After within Aspect---");
    }

    @Before("bean(demo))")
    void beanBeforeAdvice() {
        System.out.println("---Before Bean advice---");
    }

    @After("bean(demo))")
    void beanAfterAdvice() {
        System.out.println("---After Bean advice---");
    }

    @Before("args(Integer)")
    void argsBeforeAdvice() {
        System.out.println("---Before Args advice---");
    }

    @After("args(Integer)")
    void argsAfterAdvice() {
        System.out.println("---After Args advice---");
    }

    @Before("this(question7.Demo)")
    void thisBeforeAdvice() {
        System.out.println("---Before this advice---");
    }

    @After("this(question7.Demo)")
    void thisAfterAdvice() {
        System.out.println("---After this advice---");
    }
}
