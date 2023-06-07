package PracticeTests;
import org.testng.Assert;
import org.testng.annotations.Test;



//import com.aventstack.extentreports.Status;

import testBase.TestBase;

public class HomepageTests extends TestBase{
	
	@Test
	public void ValidateHomePageElements() throws Exception {
		
		String ExpectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		Assert.assertEquals(homepage1.GetTitle(), ExpectedTitle);
		Assert.assertEquals(true, homepage1.LoginBtn());
		TST.testBStackTakeScreenShot();
	}
	@Test
	public void ValidateHeaderElements() throws Exception {
		homepage1.CloseClick();
		Assert.assertEquals(homepage1.HeaderLogo(),true);
		Assert.assertEquals(homepage1.FooterLogo(),true);
		Assert.assertEquals(homepage1.SearchBar(),true);
		Assert.assertEquals(homepage1.Searchbtn(),true);
		Assert.assertEquals(homepage1.LoginBtn(),true);
		Assert.assertEquals(homepage1.BecomeSlr(),false);
		Assert.assertEquals(homepage1.MoretxtBtn(),true);
		Assert.assertEquals(homepage1.Cart(),false);
		TST.testBStackTakeScreenShot();
	}
//	@Test
//	public void HeaderElementsDisplayedOrNot() {
//		Assert.assertEquals(true,homepage1.HeaderLogo());
//	}
}
