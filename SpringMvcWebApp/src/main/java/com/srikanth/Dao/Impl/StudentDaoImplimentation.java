package com.srikanth.Dao.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.srikanth.Dao.StudentDao;
import com.srikanth.model.Student;


public class StudentDaoImplimentation {
	
	JdbcTemplate template;
	
	 
	
	public void setTemplate(JdbcTemplate template) {
		System.out.println("setter method called");
		//this.template = template;
		System.out.println("JdbcTemplate = "+template);
	}


	public void registerStudent(Student student) {
		
	//	JdbcTemplate jdbc = template;
		
		// TODO Auto-generated method stub
		
		//System.out.println("JdbcTemplate = "+jdbc);
		
	}
	






}
