package routes;

import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class FileToFile extends SpringRouteBuilder {

    @Override
    public void configure() throws Exception {
        System.out.println(this.getClass().getName() + " I am being invoked!");
        from("file://src/test/resources/inbox").to("file://src/test/resources/outbox");
        System.out.println(this.getClass().getName() + " done!");
    }
}
