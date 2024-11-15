package objectrepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.WebDriverUtility;

public class homepage extends WebDriverUtility{
@FindBy (xpath = "//a[text()=\"Organizations\"]")private WebElement orglink;
@FindBy (xpath = "//a[text()=\"Opportunities\"]")private WebElement oppolink;
@FindBy (xpath = "//img[@src=\"themes/softed/images/user.PNG\"]")private WebElement admImglink;
@FindBy (xpath = "//a[text()=\"Sign Out\"]")private WebElement signoutlink;
	//constructor
public homepage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
//getters
public WebElement getOrglink() {
	
	return orglink;
}
public WebElement getOppolink() {
	return oppolink;
}
public WebElement getAdmImglink() {
	return admImglink;
}
public WebElement getSignoutlink() {
	return signoutlink;
}
//BUSINESS LIBRARIES
public void ClickOnOrganisationlink() {
	orglink.click();
}
public void ClickOnOpportunitiesLink() {
	oppolink.click();
}
public void LogOutApp(WebDriver driver) {
	MouseOverTOElement(driver, admImglink);
	signoutlink.click();
	
	
}
}