package question6;

import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ClassThrowable {
    void hello() throws IOException {
            System.out.println("Method throwing Execption");
            throw new  IOException();
        }
}
