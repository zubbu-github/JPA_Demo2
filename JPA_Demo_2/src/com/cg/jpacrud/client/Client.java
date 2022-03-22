package com.cg.jpacrud.client;

import com.cg.jpacrud.entities.Student;
import com.cg.jpacrud.service.StudentService;
import com.cg.jpacrud.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {

    StudentService service = new StudentServiceImpl();
    
    Student student = new Student();
 
    student.setStudentId(10);
    student.setName("Zubeir");
    service.addStudent(student);
    
    //Retrieve Operations
    student=service.findStudentById(10);
    System.out.print("ID:" + student.getStudentId());
    System.out.println("Name:" + student.getName());
    
    //Update Operations
    student=service.findStudentById(10);
    student.setName("Mohammed Zubeir");
    service.updateStudent(student);
    
    student=service.findStudentById(10);
    System.out.print("ID:" + student.getStudentId());
    System.out.println("Name:" + student.getName());
    
    //Delete Operations
    student=service.findStudentById(10);
    service.removeStudent(student);
    System.out.println("End of Program/Life Cycle completed....");
	}
}
