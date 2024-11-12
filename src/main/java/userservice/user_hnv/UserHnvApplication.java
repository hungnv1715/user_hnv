package userservice.user_hnv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages = "userservice")
@EntityScan(basePackages = "userservice.entity")
@EnableJpaRepositories(basePackages = "userservice.repository")
public class UserHnvApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(UserHnvApplication.class, args);
		System.out.println("start app");
	}

}
