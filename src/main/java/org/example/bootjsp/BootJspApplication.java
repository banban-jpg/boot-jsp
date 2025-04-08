package org.example.bootjsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Boot는 알아서 Scan을 돌려주는데 Application이 있는 하위 패키지에 돌려주는 개념...
@SpringBootApplication
public class BootJspApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootJspApplication.class, args);
    }

}
