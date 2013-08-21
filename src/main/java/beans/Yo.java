package beans;

import org.apache.camel.Handler;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class Yo {
    @Handler
    public String invoke(String payload) throws Exception {
        return "I am the resurrection";
    }
}
