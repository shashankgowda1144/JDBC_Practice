package flipkart;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/save")
public class SaveServlet extends HttpServlet {

	public void  service(ServletRequest req , ServletResponse res)throws ServletException,IOException{
	
	String id = req.getParameter("id");
	String name = req.getParameter("name");
	String email = req.getParameter("email");
	String phone = req.getParameter("phone");
	String password = req.getParameter("password");
	
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/flipkart","root","root");
		PreparedStatement ps = c.prepareStatement("Insert into values (?,?,?,?,?)");
		ps.setString(1, id);
		ps.setString(2, name);
		ps.setString(3, email);
		ps.setString(4, phone);
		ps.setString(5, password);
		int num=ps.executeUpdate();
		System.out.println(num+":Row Inserted");
		ps.close();
		c.close();
	}catch(ClassNotFoundException | SQLException e) {
		e.printStackTrace();
		
	}
	req.getRequestDispatcher("home.jsp").forward(req,res);
	}
}