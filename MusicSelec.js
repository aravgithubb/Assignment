const {By,Key,Builder} = require("selenium-webdriver");
require("chromedriver");
 
async function festival()
{
 
       let driver = await new Builder().forBrowser("chrome").build();
       await driver.get("http://localhost:4200/s");
	  let elements= await driver.findelements(By.xpath("/html/body/app-root/app-festivals/ol/li"));
	  for(let elem of elements)
      {
        if (elem.getText().equals("Propeller")){
            console.log(await elem.getText());

        }
	  }

}    
festival()