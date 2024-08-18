package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        StudentDao dao = context.getBean("studentDao", StudentDao.class);
        Student std = new Student();
		/*
		 * std.setId(05); 
		 * std.setStdName("Vishok Shukla"); 
		 * std.setCity("Kishangarh");
		 * dao.insert(std)
		 */;
       //dao.delete(std);
       //dao.update(std);
       //System.out.println(result);
		/*
		 * std = dao.getStudent(5); System.out.println(std);
		 */
		 List<Student> students = dao.getAllStudents();
		 for (Student student : students) {
			System.out.println(student);
		}
    }
}