package sex.rabbitcams.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import sex.rabbitcams.initiator.Driver;
import sex.rabbitcams.pages.HomePage;

public class PerformerNathanialTest extends Driver {
	public HomePage homePageObject;

	@BeforeMethod
	public void beforeTestt() {
		homePageObject = new HomePage();
	}

	@AfterClass
	public void afterTestt() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public void PerformerNathanialSearchTest() throws InterruptedException {
		homePageObject.SearchPerformerNathanial ();

		try 
		{
			Assert.assertEquals(" Nathanial sex cams", homePageObject.SearchPerformerNathanial ());
		}

		catch (Exception e) {
			System.out.println("Test Case Failed");
		}


	} 

}
