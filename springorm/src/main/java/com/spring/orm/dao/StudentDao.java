package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;


public class StudentDao {

	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int insert(Student student) {
		Integer i = (Integer) this.hibernateTemplate.save(student);
		return i;
	}
	
	/* show single data */
	@Transactional
	public Student getSingleStudent(int stdId) {
		return this.hibernateTemplate.get(Student.class, stdId);
	}
	
	/* show all data */
	@Transactional
	public List<Student> getAllStudent(){
		return (List<Student>) this.hibernateTemplate.loadAll(Student.class);
	}
	
	/* update data */
	@Transactional
	public void updateStudent(Student student) {
		this.hibernateTemplate.update(student);
	}
	
	/* Delete data */
	@Transactional
	public void deleteData(int id) {
		this.hibernateTemplate.delete(id);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	

}
