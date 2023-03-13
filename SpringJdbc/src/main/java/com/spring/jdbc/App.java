package com.spring.jdbc;

import java.util.Iterator;
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
        System.out.println( "Hello JDBC!" );
        
//        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml"); // For XmL file
        
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class); // Without XmL file
        	
        // Without Dao
        
        /* 
        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
        
        // insert Query 
        String query = "insert into student values(?, ?, ?)";
        // Fire query
        int result = template.update(query, 67, "Sandip", "Jamnagar");
        
   		
        System.out.println("Number of record insert : " + result);
        */
        
        
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        Student student = new Student();

// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        
        // insert operation 
        /*
        student.setId(56);
        student.setName("S@ndip");
        student.setCity("Jamnagar");
        
        int result = studentDao.insert(student);
        System.out.println("Number of record insert : " + result);
        */
        
// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ 
        
        // Update operation 
        /*
        student.setId(56);
        student.setName("Sandip");
        student.setCity("Nadiad");
        
        int result = studentDao.change(student);
        
        System.out.println("Number of record update : " + result);
        */
// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        
        // Delete Operation 
        /*       
        int r = studentDao.delete(67);
        System.out.println("Number of record delete : " + r);
        */
        
// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        
        // Select Single Row from Table
        /*
        //student = studentDao.getStudent(56);
        student = studentDao.getStudent(67);
        
        System.out.println(student);
        */
// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        
        // Select Multiple Row from Table
        List<Student> list = studentDao.getAllStudent();
        
        for(Student s : list) {
        	System.out.println(s);
        }
        
        
    }
}
 	