package Product;

import java.sql.*;
import java.util.Scanner;

public class ProductEx2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	System.out.println("enter product category:");
	System.out.println("vehicle");
	System.out.println("electronics");
	String cate=sc.next();
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","Nilesh@123");
	st=con.createStatement();
	/*String sql="alter table productdetails add  pro_category varchar(40)";
	PreparedStatement pst=con.prepareStatement(sql);
	
	pst.executeUpdate();
	System.out.println("column updated successfully..");
	*/
	
	String sql2="select pname from productdetails where pro_category='"+cate+"'";
	rs=st.executeQuery(sql2);
	
	while(rs.next())
	{
		String name=rs.getString("pname");
		System.out.println(name);
	}

} catch (ClassNotFoundException | SQLException e) {
	e.printStackTrace();
}
		
		
	}
}
