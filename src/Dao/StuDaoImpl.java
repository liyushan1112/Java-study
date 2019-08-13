package Dao;

import Bean.Student;
import Util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StuDaoImpl implements StuDao {
    private Connection connection = null;
    private PreparedStatement statement = null;
    private String sql = "";

    public PreparedStatement init(String sql){
        connection = JDBCUtils.getConnection();
        try {
            statement = connection.prepareStatement(sql);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return statement;
    }

    public void close(PreparedStatement pstat,Connection conn){
        JDBCUtils.closeConnection(conn);
        JDBCUtils.closePStat(pstat);
    }
    /*
    查询所有学生信息
     */
    public List<Student> queryAll(){
        sql = "select * from stu";
        List<Student> students = new ArrayList<Student>();
        PreparedStatement pstat = init(sql);
        try{
            ResultSet rs = pstat.executeQuery(sql);
            while (rs.next()){
                Student stu = new Student();
                stu.setSno(rs.getString("sno"));
                stu.setSname(rs.getString("sname"));
                stu.setSsex(rs.getString("ssex"));
                stu.setSgrade(rs.getString("sgrade"));
                stu.setSmajor(rs.getString("smajor"));
                stu.setSscore(rs.getInt("sscore"));
                students.add(stu);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        close(pstat,connection);
        return students;
    }

    public Student queryStuBySno(String sno){
    sql = "select * from stu where sno = '"+sno+"'";
    PreparedStatement pstat = init(sql);
    Student stu = new Student();
    try{
        ResultSet rs = pstat.executeQuery(sql);
        while (rs.next()){
            stu.setSno(rs.getString("sno"));
            stu.setSname(rs.getString("sname"));
            stu.setSsex(rs.getString("ssex"));
            stu.setSgrade(rs.getString("sgrade"));
            stu.setSmajor(rs.getString("smajor"));
            stu.setSscore(rs.getInt("sscore"));
        }
        close(pstat,connection);
    }catch (Exception e){
        e.printStackTrace();
    }
    return stu;
    }
}
