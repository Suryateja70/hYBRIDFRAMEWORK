package practice;

import java.io.FileInputStream;
import java.util.Properties;

public class NotePad {
	public String np() throws Throwable{
		FileInputStream fis=new FileInputStream("C:\\Users\\surya teja\\eclipse-workspace\\HYBRID_FW1\\notepad\\npad.properties");
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty("url");
		
		
	}
	
	

}
