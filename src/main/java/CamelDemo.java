import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

/**
 * User: tom
 * Date: 8/6/13
 * Time: 2:47 PM
 */
public class CamelDemo {
    public static void main(String[] args) throws Exception {
        CamelContext camelContext = new DefaultCamelContext();

        camelContext.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("file://Users/tom/Dropbox/photos/cambodia_laos").
                        to("file://Users/tom/backup");
            }
        });

        camelContext.start();
        Thread.sleep(10000);
        camelContext.stop();

    }
}
