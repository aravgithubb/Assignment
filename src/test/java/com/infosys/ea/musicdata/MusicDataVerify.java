package com.infosys.ea.musicdata;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.infosys.ea.testbase.BaseClass;

public class MusicDataVerify extends BaseClass{
  @Test
  public void verifyPageTitle() {
	  String expectedtitle="EaCodingTests";
	  String actualtitle=driver.getTitle();
	  Assert.assertEquals(actualtitle, expectedtitle);
  }
}
