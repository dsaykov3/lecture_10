import com.progress.AutowiredExample;
import com.progress.HelloBean;
import com.progress.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HelloBean bean = (HelloBean) context.getBean("helloWorld");
        System.out.println(bean.getMessage());

        //Through Java configuration
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        TransferService service = (TransferService) ctx.getBean("standardTransferService");
        System.out.println(service.transfer(43));

      for (String beanName : ctx.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }

        AutowiredExample example = (AutowiredExample) ctx.getBean(AutowiredExample.class);
        System.out.println(example.getMessage());
    }
}
