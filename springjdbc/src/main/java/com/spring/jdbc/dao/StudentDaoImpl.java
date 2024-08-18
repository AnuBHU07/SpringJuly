package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao{

	@Autowired
	private JdbcTemplate template;
	@Override
	public int insert(Student student) {
		// TODO Auto-generated method stub
		 String query = "insert into student(id,stdName,city) values(?,?,?)";
	     int result = template.update(query,student.getId(),student.getStdName(),student.getCity());
		return result;
	}
	
	@Override
	public int update(Student student) {
		String query = "update student set stdName = ?,city = ?  where id =?";
	     int result = template.update(query,student.getStdName(),student.getCity(),student.getId());
		return result;
	}
	
	@Override
	public int delete(Student student) {
		String query = "delete from student where id=?";
	     int result = template.update(query,student.getId());
		return result;
	}
	
	public JdbcTemplate getTemplate() {
		return template;
	}
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public Student getStudent(int stdId) {

		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl(); 
		Student student = this.template.queryForObject(query, rowMapper,stdId);
		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		String query="select * from student";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		List<Student> students = this.template.query(query, rowMapper);
		return students;
	}

}
