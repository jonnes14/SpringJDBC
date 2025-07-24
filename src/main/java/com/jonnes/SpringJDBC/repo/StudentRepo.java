package com.jonnes.SpringJDBC.repo;

import com.jonnes.SpringJDBC.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {
    public void save(Student s){
        System.out.println("saved");
    }

    public List<Student> findAll() {
        List<Student> students=new ArrayList<>();
        return students;
    }
}
