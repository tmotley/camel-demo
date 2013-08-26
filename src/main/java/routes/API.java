package routes;

import org.apache.camel.spring.SpringRouteBuilder;

/**
 * User: tom
 * Date: 8/23/13
 * Time: 9:57 AM
 */
public class API extends SpringRouteBuilder {
    @Override
    public void configure() throws Exception {
        System.out.println("Starting API Route...");
        from("servlet:///hello?matchOnUriPrefix=true").to("bean:processAPI");
        System.out.println("Finished API Route");
    }
}
