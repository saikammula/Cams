package sex.rabbitcams.initiator;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Driver {

	public static WebDriver driver;
	public static String chromepath = System.getProperty("user.dir");

	public static ExtentHtmlReporter htmlReport;
	public static ExtentReports reportObj;
	public static ExtentTest logObj;
	public static String APPURL = "";
	private Properties properties = new Properties();
	private File file = new File(".//resources//config.properties");

	public Driver() {

	}
	@BeforeSuite
	//public void beforeSuite(@Optional("") String environment) {
	public void beforeSuite() throws InterruptedException {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		chromepath = System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		try {
			properties.load(new FileInputStream(file));
		} catch (IOException e) {
			System.out.println("******** please check the properties  file ********");
		}
			APPURL = properties.getProperty("URL");
			driver.get(APPURL);
			Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
	
}
