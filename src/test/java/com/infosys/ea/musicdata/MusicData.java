package com.infosys.ea.musicdata;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.infosys.ea.testbase.BaseClass;

public class MusicData extends BaseClass {
	@Test
	public void getAllData() throws Throwable {
	    List<WebElement> elements = driver.findElements(By.xpath("/html/body/app-root/app-festivals/ol/li"));
	//  List<WebElement> elements = driver.findElements(By.xpath("//ol[@style='user-select: auto;']/li"));
		System.out.println("no of elements" + elements.size());
		for (WebElement elem : elements) {
			System.out.println("Element " + elem.getText());
		}
	}
}