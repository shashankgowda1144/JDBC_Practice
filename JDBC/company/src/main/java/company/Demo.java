package company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {

	public static void main(String[] args) {

		try {
			Class.forName("org.postgresql.Driver");
			try {
				Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/EmployeeManagementSystem","postgres","root");
				java.sql.Statement stm=con.createStatement();
				stm.addBatch("insert into Employee values(101,'ram',20500,1)");
				stm.addBatch("insert into Employee values(102,'raj',20000,2)");
				stm.executeBatch();
				con.close();
				
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
