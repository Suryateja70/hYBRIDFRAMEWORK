package objectrepos;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgInfo {
	@FindBy(xpath = "//span[@class=\"dvHeaderText\"]")private WebElement OrgHeadtxt;
	//constructor
	public OrgInfo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
//getters
	public WebElement getOrgHeadtxt() {
		return OrgHeadtxt;
	
	}
//BUSINESS LIBRARIES
	public String gettextfororg() {
		return OrgHeadtxt.getText();	
	}
}

