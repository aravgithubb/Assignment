
/*Note :This BaseClass deals with  the common functions used by all the pages like open browser, close browser, Login, Logout, waiting mechanism, launch URL.
        This class will be extended to the test cases required.*/
      


package com.infosys.ea.testbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
        // open browser launch url and maximize
	@BeforeClass
	public void openBrowser() {
		// launching the browser
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		DesiredCapabilities cp = new DesiredCapabilities();
		cp.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(cp);
	        driver = new ChromeDriver(options);
		// launching the url
		driver.navigate().to("http://localhost:4200/festivals");
		// waiting mechanism to overcome the load issues.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//maximize the browser
		driver.manage().window().maximize();

	}
        // Logged into the Application
	@BeforeMethod
	public void login()

	{
		System.out.println("Logged In");

	}
	// Logged out of the Application
	@AfterMethod
	public void logout() {
		System.out.println("Log out");

	}
        // browser closed
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
}
