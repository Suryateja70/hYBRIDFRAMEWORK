package tESTcLASSES;

import org.testng.annotations.Test;

import generic.base;
import objectrepos.CreateNewOrg;
import objectrepos.homepage;
import objectrepos.orgpage;

public class CreateOrg extends base{
@Test
public void createOrganization() {
	//HOMEPAGE CLICK ON ORG MODULE
	homepage hp=new homepage(driver);
	hp.ClickOnOrganisationlink();
	//OBJECT OF ORG PAGE
	orgpage op=new orgpage(driver);
	op.ClickONorglookupIMG();
	//Give org name
	CreateNewOrg cnop=new CreateNewOrg(driver);
	cnop.createOrgANDsaveit(//excel util);
	//verification assert class
			
}
}
