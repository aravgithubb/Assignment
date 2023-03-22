/*Note : This class is extended by using the Base class. launching browser, open & close browser will be handled by base class.*/


package com.infosys.ea.musicdata;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.infosys.ea.testbase.BaseClass;

public class MusicDataVerify extends BaseClass{
	// verifying the webpage title
  @Test
  public void verifyPageTitle() 
  {
	  String expectedtitle="EaCodingTests";
	  String actualtitle=driver.getTitle();
 // comparing and validating the expected and actual title using assertions
	  Assert.assertEquals(actualtitle, expectedtitle);
  }
}
