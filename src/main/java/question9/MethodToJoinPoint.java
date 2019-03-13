package question9;

import org.springframework.stereotype.Component;

@Component
public class MethodToJoinPoint {
    Integer joinPoint(String str){
        System.out.println(str);
        return 10;
    }
}
