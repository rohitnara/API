package SpringBootStart.SpringBootFirstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class SpringBootFirstProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFirstProjectApplication.class, args);
			//System.out.println("Hello World");
	}
}
