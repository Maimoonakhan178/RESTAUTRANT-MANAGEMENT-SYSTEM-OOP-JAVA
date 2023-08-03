package OopProject;

import java.sql.*;
/*
 * @author haris
 */
public class Connect {
    static Connection con = null;
public static Connection getconnection(){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
con = DriverManager.getConnection(  
        "jdbc:mysql://localhost:3306/customer","root",""
);  
}
catch(Exception e){ 
    System.out.println(e);
    }  
    return con;
}
}
