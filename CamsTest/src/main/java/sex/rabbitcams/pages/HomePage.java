package sex.rabbitcams.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends sex.rabbitcams.initiator.Driver {

	@FindBy(css="input[placeholder='Search']")
	public WebElement searchBox;

	@FindBy(css="#body div.header.desktop-header form button svg")
	public WebElement searchButton;
	@FindBy(css = "#search-result div.search-result-bar h1")
	public WebElement searchResultsPageTitle;
	@FindBy(css = "#search-result div.suggested-text.suggested-subheading.search-result-bar")
	public WebElement errorsearchResultsPageTitle;


	public WebDriverWait wait = new WebDriverWait(driver, 30);

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public Utility utilityObj = new Utility();

	public String SearchPerformerJenny() throws InterruptedException {
		searchBox.clear();
		searchBox.sendKeys("Jenny");
		searchButton.click();
		String strng = searchResultsPageTitle.getText();
		System.out.println(strng);
		return strng;

	}
	public String SearchPerformerNathanial () throws InterruptedException {
		searchBox.clear();
		searchBox.sendKeys("Nathanial ");
		searchButton.click();
		String strng = errorsearchResultsPageTitle.getText();
		System.out.println(strng);
		return strng;

	}

}
