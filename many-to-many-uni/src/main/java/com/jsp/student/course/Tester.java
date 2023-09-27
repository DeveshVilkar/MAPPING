package com.jsp.student.course;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Tester {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("deva");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student student=new Student();
		student.setName("devesh");
		
		Course course=new Course();
		course.setCourse_name("java");
		
		Course course1=new Course();
		course1.setCourse_name("sql");
		
		Course course2=new Course();
		course2.setCourse_name("html");
		
		ArrayList<Course> courses=new ArrayList<Course>();
		courses.add(course2);
		courses.add(course1);
		courses.add(course);
		
		student.setCourses(courses);
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityManager.persist(course1);
		entityManager.persist(course);
		entityManager.persist(course2);
		entityTransaction.commit();
		
	}

}
