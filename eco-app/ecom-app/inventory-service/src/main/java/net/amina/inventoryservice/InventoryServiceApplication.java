package net.amina.inventoryservice;

import net.amina.inventoryservice.entities.Product;
import net.amina.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ProductRepository productRepository){
		return args -> {
			productRepository.save(Product.builder()
					.id(UUID.randomUUID().toString())
							.name("Computer")
							.prix(32000.0)
							.quantity(12)
					.build());

			productRepository.save(Product.builder()
					.id(UUID.randomUUID().toString())
					.name("printer")
					.prix(5676700.0)
					.quantity(10)
					.build());

			productRepository.save(Product.builder()
					.id(UUID.randomUUID().toString())
					.name("smart phone")
					.prix(567800.0)
					.quantity(12)
					.build());
		};
	}
}
