package shopmanagement.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteUpdate {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/shop","postgres","root");
			Statement stm=con.createStatement();
			
			// these are the Insert, Updsate, and Delete opertions
//			String sql="insert into product values(122,'Rasgulla',200,100)";
//			String sql="update product set name='paddu' where id=23";
			String sql = "delete from product where id=333";
			
			System.out.println("updated or inserted or deleted succesfully...");
			
			int result=stm.executeUpdate(sql);
			System.out.println(result);
			con.close();
			
		} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}