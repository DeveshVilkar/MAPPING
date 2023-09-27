package com.jsp.student.courses;

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
		
		Student student1=new Student();
		student1.setName("nishant");
		
		Student student2=new Student();
		student2.setName("mayur");
		
		Course course=new Course();
		course.setCourse_name("java");
		course.setDuration(1);
		
		Course course1=new Course();
		course1.setCourse_name("sql");
		course1.setDuration(2);
		
		Course course2=new Course();
		course2.setCourse_name("html");
		course2.setDuration(3);
		
		ArrayList<Student>  students=new ArrayList<Student>();
		students.add(student2);
		students.add(student1);
		students.add(student);
		
		ArrayList<Course> courses=new ArrayList<Course>();
		courses.add(course2);
		courses.add(course1);
		courses.add(course);
		
		student.setCourses(courses);
		student1.setCourses(courses);
		student2.setCourses(courses);
		course.setStudents(students);
		course1.setStudents(students);
		course2.setStudents(students);
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityManager.persist(course);
		entityManager.persist(course1);
		entityManager.persist(course2);
		entityTransaction.commit();
		
		
		
		
	}

}
