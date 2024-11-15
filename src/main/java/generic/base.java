package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import objectrepos.homepage;
import objectrepos.loginpage;

public class base {
	public WebDriverUtility wu=new WebDriverUtility();
	public PropertyFileUtil pu=new PropertyFileUtil();
	public javautil ju=new javautil();
	public WebDriver driver=null;//run time polymorphism
	@BeforeSuite
	public void bsconfig() {
		System.out.println("====DB connection======");
		
	}
    @BeforeClass
    public void BCconfig() throws Throwable {//Launch the browser
    	String BROWSER = pu.reasDataFromPf("browser");
    	String URL = pu.reasDataFromPf("url");
    	System.out.println("broswer name is "+""+BROWSER);
    	System.out.println("broswer name is "+""+URL);
    	if (BROWSER.equalsIgnoreCase("chrome")) {
    		driver=new ChromeDriver();
			
		}
    	else if (BROWSER.equalsIgnoreCase("edge")) {
    		driver=new EdgeDriver();
			
		}
    	else {
			System.out.println("Browser is invalid");
		}
    	driver.get(URL);
    }  
    @BeforeMethod
    public void BMconfig() throws Throwable {//login to app
    	String UN = pu.reasDataFromPf("un");
    	String PWD = pu.reasDataFromPf("pwd");
    	//LOGIN PAGE OBJECT
    	loginpage lp=new loginpage(driver);
    	lp.LoginToApp(UN, PWD);
        System.out.println("login is done successfully");
    	
    }
    @AfterMethod
    public void AMconfig() {
    	//homepage object
    	homepage hp=new homepage(driver);
    	hp.LogOutApp(driver);;
    	System.out.println("LOGOUT is successfully completed");
    }
    @AfterClass
    public void ACconfig() {
    	driver.quit();
    	System.out.println("browser is closed");
    }
    @AfterSuite
    public void Asconfig() {
    	System.out.println("===DB DISCONNECTED====");
    	
    }
}

