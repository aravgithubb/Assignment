const {By,Key,Builder} = require("selenium-webdriver");
require("chromedriver");
 
async function festival()
{
 
       let driver = await new Builder().forBrowser("chrome").build();
       await driver.get("http://localhost:4200/s");
       var expectedtitle="EaCodingTests";
       var actualtitle=driver.getTitle();
       Assert.assertEquals(actualtitle, expectedtitle);

}    
festival()