package com.finartz.codeassignment;

import java.beans.PropertyVetoException;

import javax.persistence.EntityManagerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@SpringBootApplication
//@EnableJpaRepositories("com.finartz.codeassignment.repository")
@EnableJpaRepositories
public class FinartzApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinartzApplication.class, args);
	}

}
