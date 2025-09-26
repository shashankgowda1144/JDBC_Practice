package shopmanagement.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo6 {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			try {
				Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/shop2","postgres","root");
				PreparedStatement pstm=con.prepareStatement("insert into  product values(?,?,?,?)");
				pstm.setInt(1, 222);
				pstm.setString(2, "pen");
				pstm.setInt(3, 10);
				pstm.setInt(4, 1);
				pstm.addBatch();
				
				pstm.setInt(1, 111);
				pstm.setString(2, "pencile");
				pstm.setInt(3, 6);
				pstm.setInt(4, 2);
				pstm.addBatch();
				
				pstm.executeBatch();
				con.close();
				System.out.println("Inserted");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
