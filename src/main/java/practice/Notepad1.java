package practice;

import java.io.FileInputStream;
import java.util.Properties;


public class Notepad1 {
	public String rdfnp(String key) throws Throwable{
		FileInputStream fis=new FileInputStream("C:\\Users\\surya teja\\eclipse-workspace\\HYBRID_FW1\\src\\test\\resources\\npad.properties");
		Properties p= new Properties();
		p.load(fis);
		return p.getProperty(key);
		
	}

}
