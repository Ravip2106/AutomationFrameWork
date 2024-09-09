package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchingTheDatafromProperties {

	public static void main(String[] args) throws IOException {
		//create the object of FileInputStream class 
		FileInputStream f=new FileInputStream("./src/test/resources/TestData/CommonData.properties");
		//create the object properties class
		Properties p=new Properties();
		//use load method
		 p.load(f);
		 
		 //fetch the value using getproperties method
		 String value=p.getProperty("Browser");
		 System.out.println(value);
		String value1=p.getProperty("url");
		 System.out.println(value1);
		 

	}

}
