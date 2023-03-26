package mk.ukim.finki.emtlab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class EmtLabApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmtLabApplication.class, args);
    }

}
