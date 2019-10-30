package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class FunctionalTest {

	ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();
	WebDriver driver;

	@BeforeTest
	public void initialSetUp()
	{
		driver = getWebDriver();
		driver.manage().window().maximize();
	}

	/**
	 * 
	 */
	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}

	/**
	 * 
	 * @return
	 */
	public WebDriver getWebDriver() 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Tools\\WebDrivers\\chromedriver.exe");
		driver = webDriver.get();
		driver = new ChromeDriver();
		return driver;
	}
}
