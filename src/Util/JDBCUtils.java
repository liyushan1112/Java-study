package Util;

import java.sql.*;

public class JDBCUtils {
    private static String driver = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/student";
    private static String username = "root";
    private static String password = "19971112";

    public static Connection getConnection(){
        try {
            Class.forName(driver);
        }catch (Exception e){
            e.printStackTrace();
        }
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(url,username,password);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return connection;
    }
    //关闭数据库连接
    public static boolean closeConnection(Connection conn){
        try {
            conn.close();
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }

    public static boolean closePStat(PreparedStatement pstat){
        try {
            pstat.close();
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }

    public static boolean closeStat(Statement stat){
        try {
            stat.close();
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }
}
