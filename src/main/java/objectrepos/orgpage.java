package objectrepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orgpage {
	@FindBy(xpath = "//img[@src=\\\"themes/softed/images/btnL3Add.gif\\\"]")private WebElement orglookupimg;
//constructor
public orgpage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
//getters
public WebElement getOrglookupimg() {
	return orglookupimg;

}
//BUSINESS LIBRARIES
public void ClickONorglookupIMG() {
	orglookupimg.click();
}
}
