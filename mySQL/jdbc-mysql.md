## 使用 JDBC 连接 MySQL

### 下载 mysql-connector-java
在下面的网站中 Operating System 选择 Platform Independent 下载压缩包

[https://downloads.mysql.com/archives/c-j/](https://downloads.mysql.com/archives/c-j/)

解压之后获得后缀为 `.jar` 的文件，如 `mysql-connector-java-8.0.20.jar`

### 新建项目并添加依赖
在项目中创建 `lib` 文件夹，并拷贝 `mysql-connector-java-8.0.20.jar` 文件到该文件夹中。在项目中添加该依赖。

### 新建一个测试类
```java
package club.banyuan.mysqldemo.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlDemo {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/db_demo?useSSL=false";
	
	static final String USER = "root";
    static final String PASS = "123456";
    
    public static void main(String[] args) {
    	Connection conn = null;
        Statement stmt = null;
        
        try {
        	Class.forName(JDBC_DRIVER);
        	System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("实例化Statement对象...");
            stmt = conn.createStatement();
            String sql;
            sql = "select sno, sname, ssex from student";
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                // 通过字段检索
                int id  = rs.getInt("sno");
                String name = rs.getString("sname");
                String sex = rs.getString("ssex");
    
                // 输出数据
                System.out.print("ID: " + id);
                System.out.print(", 姓名: " + name);
                System.out.print(", 性别: " + sex);
                System.out.print("\n");
            }
            
            rs.close();
            stmt.close();
            conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try{
                if(stmt!=null) stmt.close();
            }catch(Exception e){
            }
            try{
                if(conn!=null) conn.close();
            }catch(Exception e){
                e.printStackTrace();
            }
		}
        System.out.println("Goodbye!");
	}
}
```

### 运行查看效果
```
连接数据库...
实例化Statement对象...
ID: 101, 姓名: 李华, 性别: 男
ID: 102, 姓名: 孙蓉, 性别: 女
ID: 103, 姓名: 赵明, 性别: 男
ID: 104, 姓名: 李鹏, 性别: 男
ID: 105, 姓名: 吴天, 性别: 男
ID: 106, 姓名: 沈月, 性别: 女
Goodbye!
```
