package tests;

import org.testng.annotations.Test;

public class HomePageTest extends FunctionalTest {

	@Test
	public void firstTest()
	{
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	}
}
