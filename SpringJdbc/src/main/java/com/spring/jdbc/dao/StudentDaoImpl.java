package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;

@Component("studentDao") // For autowiring
public class StudentDaoImpl implements StudentDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	//	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public int insert(Student student) {
		
		// insert query 
		String query = "insert into student values(?, ?, ?)";
		
		int result = jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		
		return result;
	}



	@Override
	public int change(Student student) {
			
		// Update Query 
		String query = "update student set name = ?, city = ? where id = ?";
		
		int r = jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		
		return r;
	}

	@Override
	public int delete(int studentId) {
		
		// Delete query 
		
		String query = "delete from student where id = ?";
		
		int r = jdbcTemplate.update(query, studentId);
		
		return r;
	}

	@Override
	public Student getStudent(int studentId) {
		
		// Select Query 
		String query = "select * from student where id = ?";
		
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = jdbcTemplate.queryForObject(query, rowMapper, studentId);
		
		// 
		
		return student;
	}

		
	@Override
	public List<Student> getAllStudent() {
			
		String query = "select * from student";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		List<Student> students = jdbcTemplate.query(query, rowMapper);
		
		return students;
	}
	
}
