import beans.Yo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: tom
 * Date: 8/13/13
 * Time: 5:05 PM
 */
public class SpringDemo {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"app-context.xml"});
        Yo yo = (Yo) context.getBean("yo");
        System.out.println(yo.invoke("none"));
    }
}
