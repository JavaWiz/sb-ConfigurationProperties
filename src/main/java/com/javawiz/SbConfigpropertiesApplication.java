package com.javawiz;

import com.javawiz.config.CurrencyConfiguration;
import com.javawiz.model.Currency;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class SbConfigpropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbConfigpropertiesApplication.class, args);
	}

	@Bean
	protected CommandLineRunner run(CurrencyConfiguration currencyConfiguration){
		return (args) -> currencyConfiguration.getMappings().entrySet().forEach(data -> log.info("{}", data));
	}
}
