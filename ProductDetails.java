package Product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDetails {

	static Connection con=null;
	

static
{
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","Nilesh@123");
		}	
	catch (ClassNotFoundException | SQLException e)
	{
		e.printStackTrace();
	}
}

void maxPrice()
{
	
	try {
		Statement st=con.createStatement();
		
		String sql="select * from productdetails where price=(select MAX(price)from productdetails)";
		ResultSet res1=st.executeQuery(sql);
		
		while(res1.next())
		{
			int id=res1.getInt("pid");
			String name=res1.getString("pname");
			String price=res1.getString("price");
			String pro_cate=res1.getString("pro_category");
			
			
			System.out.println("id is:"+id);
			System.out.println("name is:"+name);
			System.out.println("price is:"+price);
			System.out.println("catogory:"+pro_cate);
			
		}
			
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
void minPrice()
{

	try {
		Statement st=con.createStatement();
		
		String sql="select * from productdetails where price=(select MIN(price) from productdetails)";
		ResultSet res2=st.executeQuery(sql);
		while(res2.next())
		{
			int id=res2.getInt("pid");
			String name=res2.getString("pname");
			String price=res2.getString("price");
			String pro_cate=res2.getString("pro_category");
			System.out.println("id is:"+id);
			System.out.println("name is:"+name);
			System.out.println("price is:"+price);
			System.out.println("catogory:"+pro_cate);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
}
}
