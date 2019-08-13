package Dao;

import Bean.Student;

import java.util.List;

public interface StuDao {
    public List<Student> queryAll(); //查询所有学生信息
    public Student queryStuBySno(String sno); //根据学号查询学生信息
}
