package shopmanagement.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectedAllTheProducts {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/shop","postgres","root");
			
			Statement stm=con.createStatement();
			
			String sql="select * from product";
			ResultSet rs=stm.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println("id is: "+rs.getInt(1));
				System.out.println("name is: "+rs.getString(2));
				System.out.println("price is: "+rs.getInt(3));
				System.out.println("quantity is: "+rs.getInt(4));
				System.out.println("------------------");
			}
			con.close();
			} catch (SQLException e) {
				e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}



//package shopmanagement.ty;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class SelectedAllTheProducts {
//	public static void main(String[] args) {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			
//			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
//			
//			Statement stm=con.createStatement();
//			
//			String sql="select * from register";
//			ResultSet rs=stm.executeQuery(sql);
//			
//			while(rs.next()) {
//				System.out.println("id is: "+rs.getInt(1));
//				System.out.println("name is: "+rs.getString(2));
//				System.out.println("price is: "+rs.getInt(3));
//				System.out.println("quantity is: "+rs.getInt(4));
//				System.out.println("------------------");
//			}
//			con.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//	}
//}
