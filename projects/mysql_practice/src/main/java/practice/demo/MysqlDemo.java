package main.java.practice.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlDemo {
    //mysql
    //数据库用户名
    static final String USER = "root";//用户名默认为root
    //数据库密码
    static final String PASSWORD = "hqijia.123456";

    //JDBC 连接驱动     //MySQL 8 的固定格式
    //com.mysql.cj.jdbc.Driver
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    //JDBC连接串 db_demo 表示数据库名称
    static final String DB_URL = "jdbc:mysql://localhost:3306/db_demo?useSSL=false";
    //jdbc:mysql://localhost:3306/db_demo?useSSL= false

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try{
            Class.forName(JDBC_DRIVER);
            System.out.println("连接数据库...");
            connection = DriverManager.getConnection(DB_URL,USER,PASSWORD);
            System.out.println("实例化 Statement 对象...");
            statement = connection.createStatement();

            //SQL 语句
            String sql = "SELECT sno, sname FROM student";
            //执行SQL 查询语句
            ResultSet rs = statement.executeQuery(sql);
            //循环遍历查询结果
            while (rs.next()) {
                //获取本条数据的 sno 字段值
                Integer sno = rs.getInt("sno");
                //获取本条数据的 sname 字段值
                String sname = rs.getString("sname");
                //输出结果
                System.out.println("学生序号为:"+sno+"的姓名是："+ sname);
            }
            //关闭 ResultSet
            rs.close();
            //关闭 Statement
            statement.close();
            //关闭 Connection
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //检查关闭连接
            try {
                if (statement !=null){
                    statement.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            try {
                if (connection !=null){
                    connection.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
