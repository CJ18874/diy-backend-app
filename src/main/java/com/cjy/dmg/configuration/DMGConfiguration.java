package com.cjy.dmg.configuration;

import java.net.URISyntaxException;

import javax.sql.DataSource;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DMGConfiguration {

    @Bean
    public DataSource dataSource() throws URISyntaxException {
    	DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("JDBC_DATABASE_USERNAME");
		dataSource.setPassword("JDBC_DATABASE_PASSWORD");
		dataSource.setUrl("JDBC_DATABASE_URL");
		return dataSource;
    }
    
	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper;
	}
}
