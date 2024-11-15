package objectrepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrg {
	@FindBy(xpath = "//input[@name=\"accountname\"]")private WebElement orgtext;
	@FindBy(xpath = "//input[@title=\"Save [Alt+S]\"]")private WebElement saveorg;


//constructor
public CreateNewOrg(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

//getters
public WebElement getOrgtext() {
	return orgtext;
}


public WebElement getSaveorg() {
	return saveorg;
}
//business librariesu
public void createOrgANDsaveit(String ORGNAME) {
	orgtext.sendKeys(ORGNAME);
	saveorg.click();
	
}
}