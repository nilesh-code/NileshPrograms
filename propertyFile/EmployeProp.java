package propertyFile;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class EmployeProp {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw=null;
		
		Properties prop=new Properties();
		
		fw=new FileWriter("F:\\Workspace\\java programs\\FileHaEx\\EmpDetails.properties");
		
		prop.setProperty("Ename", "Samba");
		prop.setProperty("Age"," 40");
		
		prop.store(fw,"External file");
		
		System.out.println("Properties file created successfully..");
		
		
	}
	
}
