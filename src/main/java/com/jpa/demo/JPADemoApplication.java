package com.jpa.demo;

import com.example.restservice.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import java.util.Date;
//@ComponentScan("com")
//@SpringBootApplication
public class JPADemoApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonJPARepository dao;

    public static void main(String[] args) {

        SpringApplication.run(JPADemoApplication.class, args);

    }

    public void run(String... args) throws Exception {
        // logger.info("All users -> {}", dao.findAll());
        logger.info("User id 10001 -> {}", dao.findById(10001));
        logger.info("Inserting -> {}", dao.insert(new Person("Uday", "Hyderabad", new Date())));
        logger.info("Updating  10001 -> {}", dao.update(new Person(10001, "Uday", "Bangalore", new Date())));
        logger.info("findAll  -> {}", dao.findAll());

        dao.deleteById(10010);
        // logger.info("User id 10002 -> {}", dao.findById(10002));
        //logger.info("Delete id 10003 -> {}", dao.deleteById(10003));
    }
}
