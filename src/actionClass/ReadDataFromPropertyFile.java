package actionClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException 
	{
		//create object of property file class
		Properties prop=new Properties();
		//create object of FileInputStream class
		FileInputStream myfile=new FileInputStream("C:\\Users\\mahes\\eclipse-workspace\\seleniumBasics\\myProperty.properties");
		//call load method
		prop.load(myfile);
		//get load method
		System.out.println(prop.get("url"));
		System.out.println(prop.get("mobNum"));

	}

}
