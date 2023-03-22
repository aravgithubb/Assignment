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
		// declaring the string 
		String expected="Frank Jupiter";
		// finding elements
		List<WebElement> elements = driver.findElements(By.xpath("/html/body/app-root/app-festivals/ol/li"));
		// printing the number of elements found
		System.out.println("no of elements" + elements.size());
		Thread.sleep(5000);
		 using loop to extract the elements and perform operation.
		for (WebElement elem : elements) {
			if (elem.getText().equals("Propeller"))

			{
				// verifying the getting text with expected and printing the text of webelement.
		                System.out.println("Element " + elem.getText());
			         Assert.assertEquals(elem, expected);;
			}
		}
	}
}
