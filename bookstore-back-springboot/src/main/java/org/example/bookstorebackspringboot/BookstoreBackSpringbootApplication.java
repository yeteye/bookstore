package org.example.bookstorebackspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement // Enable transaction management
@SpringBootApplication
public class BookstoreBackSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreBackSpringbootApplication.class, args);
	}

}
