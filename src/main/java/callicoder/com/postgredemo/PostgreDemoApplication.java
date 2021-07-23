package callicoder.com.postgredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PostgreDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostgreDemoApplication.class, args);
	}

}
