package generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {
	/**
	 * author surya_teja
	 * used to maximize the window
	 * 
	 * @param driver
	 */
	public void MaximizeWindow(WebDriver driver) {
	driver.manage().window().maximize();	
	}
	/**
	 * author surya_teja
	 * used to minimize the window
	 * @param driver
	 */
public void Minimise(WebDriver driver) {
	driver.manage().window().minimize();

}
/**
 * author surya_teja
 * it is used for implicitly wait
 * @param driver
 */
public void WaitForPageLoad(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}
/**
 * used to handle DROPDOWNS
 * @param element
 * @param index
 */
public void HandleDD(WebElement element,int index) {
     Select s= new Select(element);
	 s.selectByIndex(index);
}
public void HandleDD(String value,WebElement element) {
    Select s= new Select(element);
	 s.selectByValue(value);
}
public void HandleDD(WebElement element,String VisibleText) {
    Select s= new Select(element);
	 s.selectByVisibleText(VisibleText);
}
/**
 * used to HOVER the pointer on a ELEMENT 
 * @param driver
 * @param ele
 */
public void MouseOverTOElement(WebDriver driver,WebElement ele) {
	Actions a=new Actions(driver);
	a.moveToElement(ele).perform();
}
/**
 * used to right click on Page
 * @param driver
 */
public void RightClickPage(WebDriver driver) {
	Actions a=new Actions(driver);
	a.contextClick();
}
/**
 * used to right click on element
 * @param driver
 */
public void RightClickPage(WebDriver driver,WebElement ele) {
	Actions a=new Actions(driver);
	a.contextClick(ele).perform();
}
/**
 * used to double click on the element
 * @param driver
 */
public void DoubleClickAction(WebDriver driver) {
	Actions a=new Actions(driver);
	a.contextClick().perform();
}
public void DragAndDrop(WebDriver driver,WebElement src,WebElement dest) {
	Actions a=new Actions(driver);
	a.dragAndDrop(src, dest);
}
}
