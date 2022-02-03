package com.jdbc.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class JdbcDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	//@Autowired
	PersonJbdcDao dao;

	public static void main(String[] args) {

SpringApplication.run(JdbcDemoApplication.class, args);

	}

	public void run(String... args) throws Exception {
		logger.info("All users -> {}", dao.findAll());
		logger.info("User id 10001 -> {}", dao.findById(10001));
		logger.info("User id 10002 -> {}", dao.findById(10002));
		logger.info("Delete id 10003 -> {}", dao.deleteById(10003));
	}
}
