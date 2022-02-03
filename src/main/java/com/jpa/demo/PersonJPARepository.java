package com.jpa.demo;


import com.example.restservice.Person;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Component
@Repository
@Transactional
public class PersonJPARepository {

    @PersistenceContext
    EntityManager  entityManager;


    public Person findById(int id) {
        return entityManager.find(Person.class, id);
    }

    public Person update(Person person) {
        return entityManager.merge(person);
    }

    public Person insert(Person person) {
        return entityManager.merge(person);
    }

    public List<Person> findAll() {
        TypedQuery<Person> nq = entityManager.createNamedQuery("find_all_persons", Person.class);
        return nq.getResultList();
    }

    public void deleteById(int id) {
        Person person = findById(id);
        entityManager.remove(person);
    }

}
