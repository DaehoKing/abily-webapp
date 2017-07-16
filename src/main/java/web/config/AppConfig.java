package web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.retry.annotation.EnableRetry;

/**
 * Created by abily on 2017. 7. 5..
 */
@Configuration
@ComponentScan(basePackages = "abily")
@EnableAspectJAutoProxy
@EnableRetry
public class AppConfig {

}
