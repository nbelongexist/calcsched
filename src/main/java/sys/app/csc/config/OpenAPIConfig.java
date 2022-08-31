package sys.app.csc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenAPIConfig {
	Contact contact = new Contact().name("Nehemias C. Belong Jr").email("nbelong@exists.com").url("https://github.com/nbelongexist/calcsched");
	
	@Bean
	public OpenAPI customConfiguration() {
		
		return new OpenAPI().info(
				new Info()
					.title("Calendar Schedule Calculator")
					.version("1.0")
					.description("Calendar Schedule Calculator - calcuates the day and hour with the provided start and end date")
					.contact(contact)
				);
				
	};
}
