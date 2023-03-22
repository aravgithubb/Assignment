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

	@BeforeClass
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver",".//drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		DesiredCapabilities cp = new DesiredCapabilities();
		cp.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(cp);
	    driver = new ChromeDriver(options);
		driver.navigate().to("http://localhost:4200/festivals");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();

	}

	@BeforeMethod
	public void login()

	{
		System.out.println("Logged In");

	}

	@AfterMethod
	public void logout() {
		System.out.println("Log out");

	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
}