package beans;

import org.apache.camel.Exchange;
import org.springframework.stereotype.Component;

/**
 * User: tom
 * Date: 8/23/13
 * Time: 10:03 AM
 */
@Component("processAPI")
public class ProcessAPI {
    public void process(Exchange exchange) throws Exception {
        String contentType = exchange.getIn().getHeader(Exchange.CONTENT_TYPE, String.class);
        String path = exchange.getIn().getHeader(Exchange.HTTP_URI, String.class);
        path = path.substring(path.lastIndexOf("/"));

        // assert camel http header
        String charsetEncoding = exchange.getIn().getHeader(Exchange.HTTP_CHARACTER_ENCODING, String.class);
        // assert exchange charset
        exchange.getOut().setHeader(Exchange.CONTENT_TYPE, contentType + "; charset=UTF-8");
        exchange.getOut().setHeader("PATH", path);
        exchange.getOut().setBody("<b>Hello World</b>");
    }
}
