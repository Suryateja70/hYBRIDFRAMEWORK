package generic;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtil {
	public String reasDataFromPf(String key) throws Throwable {
		FileInputStream fis=new FileInputStream(iconstantutil.propath);
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty("un");
	}
	
	
System.out.println("It Is The Change Made By Me In GitHub")
}
