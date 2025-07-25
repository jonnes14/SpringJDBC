package com.jonnes.SpringJDBC.repo;

import com.jonnes.SpringJDBC.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {
  /*personal notes*/
    //Spring's JdbcTemplate for database interactions. JdbcTemplate is a core component of the
    // Spring framework's JDBC support, providing a high-level abstraction over the standard JDBC API,
    // significantly reducing boilerplate code and handling common tasks like
    // resource management and exception handling.
   private JdbcTemplate jdbc;

   @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    public void save(Student s){
       String sql="insert into student(rollno , name , marks) values(?,?,?)";
        int rows =jdbc.update(sql,s.getRollNo(),s.getName(),s.getMarks());
        System.out.println("rows affected"+rows);
    }

    public List<Student> findAll() {
        List<Student> students=new ArrayList<>();
        String sql="select* from student";
        RowMapper<Student> mapper=new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student s=new Student();
                s.setRollNo(rs.getInt("rollno"));
                s.setMarks(rs.getInt("marks"));
                s.setName(rs.getString("name"));
                return s;
            }
        };
        return jdbc.query(sql,mapper);
    }

}
