package beans;

import org.apache.camel.CamelContext;
import org.apache.camel.CamelContextAware;
import org.springframework.stereotype.Component;

/**
 */
@Component
public class CamelRunner implements CamelContextAware, Runnable {
    private CamelContext ctx;

    @Override
    public void setCamelContext(CamelContext camelContext) {
        this.ctx = camelContext;
    }

    @Override
    public CamelContext getCamelContext() {
        return ctx;
    }

    public void run()  {
        try {
            System.out.println("CAMEL STARTING");
            getCamelContext().start();
            Thread.sleep(10000);
            getCamelContext().stop();
            System.out.println("CAMEL STOPPED");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
