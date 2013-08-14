package beans;

import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class Yo {
    public String invoke() throws Exception {
        return "I am the resurrection";
    }
}
