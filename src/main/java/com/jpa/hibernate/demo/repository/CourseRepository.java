package com.jpa.hibernate.demo.repository;

import com.jpa.hibernate.demo.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
@Transactional
public class CourseRepository {
    @Autowired
    EntityManager em;

    public Course findByID(Long id) {
        return em.find(Course.class, id);
    }


    public void deleteByID(Long id) {
        em.remove(findByID(id));
    }

    public Course save(Course course) {
        if (course.getId() == null) {
            em.persist(course);
        } else {
            em.merge(course);
        }
        return course;
    }

    public void playWithEntityManager() {

        Course course1 = new Course("Web Services in 100 Steps");
        em.persist(course1);

        Course course2 = new Course("Angular Js in 100 Steps");
        em.persist(course2);

        em.flush();
        //em.detach(course1);
        //em.clear();

        course1.setName("Web Services in 100 Steps - Updated");
        course2.setName("Angular Js in 100 Steps - Updated");

        em.refresh(course1);

        em.flush();
    }

}
