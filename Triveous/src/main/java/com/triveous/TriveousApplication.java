package com.triveous;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/*@Auther VIJAY HANDAL*/


@SpringBootApplication
@EnableSwagger2
public class TriveousApplication {
	public static void main(String[] args) {
		SpringApplication.run(TriveousApplication.class, args);
	}

}
