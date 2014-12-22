package hello;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

// search recursively hello pkg for @Component annotation
@ComponentScan
// activate reasonable default behaviours based on classpath
// Spring MVC DispatcherServlet is auto-configured and registered
@EnableAutoConfiguration

public class Application {
  public static void main( String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
