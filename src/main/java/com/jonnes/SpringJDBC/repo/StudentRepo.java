package com.jonnes.SpringJDBC.repo;

import com.jonnes.SpringJDBC.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {
   private JdbcTemplate jdbc;

   @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    public void save(Student s){
        System.out.println("saved");
    }

    public List<Student> findAll() {
        List<Student> students=new ArrayList<>();
        return students;
    }

}
