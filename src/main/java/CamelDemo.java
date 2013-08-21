import beans.CamelRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: tom
 * Date: 8/6/13
 * Time: 2:47 PM
 */
public class CamelDemo {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"app-context.xml"});
        CamelRunner runner = (CamelRunner) context.getBean("camelRunner");
        new Thread(runner).start();
    }
}
