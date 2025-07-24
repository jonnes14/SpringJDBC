package com.jonnes.SpringJDBC.model;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
    private  int rollNo;
    private String name;
    private int marks;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public int getMarks() {
        return marks;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public int getRollNo() {
        return rollNo;
    }
    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
