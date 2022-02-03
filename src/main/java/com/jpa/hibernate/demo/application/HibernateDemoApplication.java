package com.jpa.hibernate.demo.application;

import com.jpa.hibernate.demo.entity.Course;
import com.jpa.hibernate.demo.repository.CourseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com")
@SpringBootApplication
@EntityScan("com")
public class HibernateDemoApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    CourseRepository dao;

    public static void main(String[] args) {

        SpringApplication.run(HibernateDemoApplication.class, args);

    }

    public void run(String... args) throws Exception {
        // logger.info("All users -> {}", dao.findAll());
      /*  logger.info("Course  id 10001 -> {}", dao.findByID(10001L));
        logger.info("New Course  Created -> {}", dao.save(new Course("TEst Course")));
        dao.deleteByID(10001L);*/
        dao.playWithEntityManager();
        //logger.info("Inserting -> {}", dao.insert(new Person("Uday", "Hyderabad", new Date())));
        //logger.info("Updating  10001 -> {}", dao.update(new Person(10001, "Uday", "Bangalore", new Date())));
        //logger.info("findAll  -> {}", dao.findAll());

        //dao.deleteById(10010);
        // logger.info("User id 10002 -> {}", dao.findById(10002));
        //logger.info("Delete id 10003 -> {}", dao.deleteById(10003));
    }
}
