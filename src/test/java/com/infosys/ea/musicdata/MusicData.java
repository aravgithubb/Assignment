
/*Note : This class is extended by using the Base class. launching browser, open & close browser will be handled by base class.*/
	
package com.infosys.ea.musicdata;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.infosys.ea.testbase.BaseClass;

public class MusicData extends BaseClass {
	
	@Test
	//getting the text of webelement and printing in the console
	public void getAllData() throws Throwable 
	{
		// finding multiple elements and holding in the list
	        List<WebElement> elements = driver.findElements(By.xpath("/html/body/app-root/app-festivals/ol/li"));
		// getting and printing the found elements number in console.
		System.out.println("no of elements" + elements.size());
		// looping the elements to get the individual element details.
		for (WebElement elem : elements) 
		{
			// printing the elements text and attribute value in the console.
			System.out.println("Element " + elem.getText());
			System.out.println("Element " + elem.getAttribute("style");


			
		}
	}
}
