/*Note : This class is extended by using the Base class. launching browser, open & close browser will be handled by base class.*/



package com.infosys.ea.musicdata;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.infosys.ea.testbase.BaseClass;

public class MusicGetSele extends BaseClass {
	@Test
	public void getSelected() throws Throwable {
		String expected="Frank Jupiter";
		List<WebElement> elements = driver.findElements(By.xpath("/html/body/app-root/app-festivals/ol/li"));
		System.out.println("no of elements" + elements.size());
		Thread.sleep(5000);
		for (WebElement elem : elements) {
			if (elem.getText().equals("Propeller"))

			{
				// verifying the getting text with expected
		                SoftAssert verify= new SoftAssert();
				verify.assertEquals(elem, expected);
			}
		}
	}
}
