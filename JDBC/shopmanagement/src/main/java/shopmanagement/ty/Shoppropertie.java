package shopmanagement.ty;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Shoppropertie {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			FileInputStream fileinputstream=new FileInputStream("shopdb.properties");
			Properties properties=new Properties();
			properties.load(fileinputstream);
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/shop",properties);
			Statement stm=con.createStatement();
			String sql="insert into product values(333,'biscuit',50,4)";
			stm.execute(sql);
			con.close();
			System.out.println("inserted");
		} catch (SQLException e) {
				e.printStackTrace();
		} catch (IOException e) {
				e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
}
}
