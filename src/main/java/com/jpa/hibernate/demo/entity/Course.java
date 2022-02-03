package com.jpa.hibernate.demo.entity;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "CourseDetails")  // table equivalant is course_details
@NamedQueries(value = {
        @NamedQuery(name = "query_get_all_courses", query = "Select  c  From Course c"),
        @NamedQuery(name = "query_get_100_Step_courses", query = "Select  c  From Course c where name like '%100 Steps'")
        }
        )
public class Course {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "FullName", nullable = false)
    private String name;
    @UpdateTimestamp
    private LocalDateTime lastUpdatedDateTime;

    @CreationTimestamp
    private LocalDateTime createdDateTime;


    protected Course() {
    }

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" + "id=" + id + ", name='" + name + '\'' + '}';
    }

    public Long getId() {
        return id;
    }
}
