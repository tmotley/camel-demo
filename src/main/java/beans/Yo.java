package beans;

import org.apache.camel.Handler;
import org.springframework.stereotype.Component;

import java.io.File;

/**
 *
 */
@Component("yo")
public class Yo {
    @Handler
    public String doSomething(File payload) throws Exception {
        System.out.println("I am the resurrection");
        return "I am the resurrection";
    }
}
