package ma.majbar.customercommandsservice;

import org.axonframework.commandhandling.SimpleCommandBus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerCommandsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerCommandsServiceApplication.class, args);


	}
	@Bean
	public SimpleCommandBus axonServerCommandBus(){
		return SimpleCommandBus.builder().build();
	}
}
