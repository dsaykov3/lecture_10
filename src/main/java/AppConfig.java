import com.progress.AutowiredExample;
import com.progress.HelloBean;
import com.progress.TransferService;
import com.progress.TransferServiceImpl;
import com.progress.WiredTrasnfer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.progress")
public class AppConfig {

    @Bean(name = "standardTransferService")
    public TransferService transferService() {
        return new TransferServiceImpl();
    }

    @Bean(name = "wiredTransferService")
    public TransferService wiredTransferService() {
        return new WiredTrasnfer();
    }

    @Bean(name = "autowiredExample")
    public AutowiredExample autowiredExample() {
        return new AutowiredExample();
    }

    @Bean
    public HelloBean helloBean() {
        return new HelloBean();
    }
}