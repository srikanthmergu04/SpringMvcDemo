package com.srikanth.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.srikanth.Dao.StudentDao;
import com.srikanth.Dao.Impl.StudentDaoImplimentation;
import com.srikanth.Service.StudentService;
import com.srikanth.model.Student;

@Component
public class StudentServiceImplimentation{
	
	
	StudentDaoImplimentation dao = new StudentDaoImplimentation();

	public void registerStudent(Student student) {
		// TODO Auto-generated method stub
		
	//	StudentDao studentDao = new StudentDaoImplimentation();
		
		dao.registerStudent(student);
		
	}

}
