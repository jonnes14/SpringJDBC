package com.jonnes.SpringJDBC;

import com.jonnes.SpringJDBC.model.Student;
import com.jonnes.SpringJDBC.repo.StudentRepo;
import com.jonnes.SpringJDBC.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringJdbcApplication.class, args);
		Student s= context.getBean(Student.class);
		s.setName("jonnes");
		s.setMarks(65);
		s.setRollNo(1);

		StudentService service=context.getBean(StudentService.class);
		service.addStudent(s);
		List<Student> students=service.getStudents();
		System.out.println(students);
	}

}
