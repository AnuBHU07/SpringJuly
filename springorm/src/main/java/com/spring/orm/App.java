package com.spring.orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("ormconfig.xml");
    	StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
    	Student student = new Student(02,"Ayush Bohra", "Jaipur");
    	
    	//studentDao.insert(student);
    	List<Student> students = studentDao.getAllStudent();
    	for (Student student2 : students) {
			System.out.println(student2);
		}
    }
}
