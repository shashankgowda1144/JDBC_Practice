package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
 public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("mysql://localhost:3306/jdbc_db","root","root");
		//Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/shop?user=postgres&password=root");
		Statement stm=con.createStatement();
		String sql="insert into product values(223,'Sandal','50','2')";
		System.out.println("Data Inserted");
		stm.execute(sql);
		con.close();
	}catch(ClassNotFoundException e){
		e.printStackTrace();
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
}
}