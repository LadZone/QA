package Round;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;



public class oneTicket {
	
	//public static WebDriver driver=new ChromeDriver();
	
//public static void login() {
	
	//WebDriver newdrivers=oneTicket.driver;
	
	//newdrivers.findElement(By.name("userName")).sendKeys("tutorial");
	//newdrivers.findElement(By.name("password")).sendKeys("tutorial");
	//newdrivers.findElement(By.name("login")).click();
	//}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		// Create an instance of the driver
		WebDriver driver=new ChromeDriver();
		
		// Navigate to a web page
		driver.get("http://demoaut.com");
		driver.manage().window().maximize();
		
		 // Perform actions on HTML elements, entering text and submitting the form
	    WebElement usernameElement     = driver.findElement(By.name("userName"));
	    WebElement passwordElement     = driver.findElement(By.name("password"));
	    WebElement login        = driver.findElement(By.name("login"));
	    
	    
	    usernameElement.sendKeys("tutorial");
	    passwordElement.sendKeys("tutorial");
	    login.click();
	    
	    // WEBPAGE TEST
	    
	   String actualUrl="http://newtours.demoaut.com/mercuryreservation.php"; 
	   String expectedUrl= driver.getCurrentUrl();
	   
	   if (actualUrl.contentEquals(expectedUrl) ) {
		   System.out.println("PASSED: Login");
		   System.out.println(expectedUrl);
		   
	   }	else {
		System.out.println("FAILED: Login");
		 System.out.println(expectedUrl);
	   }
	   
	   
	   //************FLIGHT DETAILS********//
	   
	   //---------------TYPE---------------//	
	  
	   WebElement RoundTrip = driver.findElement(By.xpath("//input[@value='roundtrip']"));
	   WebElement OneWay = driver.findElement(By.xpath("//input[@value='oneway']"));
	
	   RoundTrip.click();			
	   System.out.println("Round Trip");					
       		
      
       //-------------- Passengers---------//
       Select Passengers = new Select(driver.findElement(By.name("passCount")));
       Passengers.selectByVisibleText("2");
       Passengers.selectByIndex(1);
       System.out.println("2 passengers");
       
       //-------------DEPARTING FROM-------//
       
       Select Departing= new Select(driver.findElement(By.name("fromPort")));
       Departing.selectByVisibleText("Sydney");
       Departing.selectByIndex(8);
       System.out.println("Departing from Sysney");
       
       //----------DEPARTING DATE---------//
       
       //=============Month===============//
       Select MonthDE= new Select(driver.findElement(By.name("fromMonth")));
       MonthDE.selectByVisibleText("July");
       MonthDE.selectByIndex(6);
       System.out.println("Month July");
       
       //=================Day=============//
       Select DayDE= new Select(driver.findElement(By.name("fromDay")));
       DayDE.selectByVisibleText("9");
       DayDE.selectByIndex(8);
       System.out.println("Day 9");
       
       //-------------ARRIVING IN---------//
       Select Arriving= new Select(driver.findElement(By.name("toPort")));
       Arriving.selectByVisibleText("New York");
       Arriving.selectByIndex(3);
       System.out.println("Arriving in  New York");
       
       
       //------- RETURNING  DATE----------//
       
       
       //=======Month=====================//
       Select MonthAR= new Select(driver.findElement(By.name("toMonth")));
       MonthAR.selectByVisibleText("August");
       MonthAR.selectByIndex(7);
       System.out.println("month August");
       
       //========Day======================//
       Select DayAR= new Select(driver.findElement(By.name("toDay")));
       DayAR.selectByVisibleText("17");
       DayAR.selectByIndex(16);
       System.out.println("day 17");
       
       //********** PEREFERENCES**********//
       
       //----------SERVICE CLASS----------//
       
       WebElement economyClass = driver.findElement(By.xpath("//input[@value='Coach']"));
       WebElement bussinessClass = driver.findElement(By.xpath("//input[@value='Business']"));
       WebElement firstClass = driver.findElement(By.xpath("//input[@value='First']"));
       
       bussinessClass.click();			
	   System.out.println("bussiness class");
	   
	   
	   //------------AIRLINE---------------//
       
	   Select AirlineName= new Select(driver.findElement(By.name("airline")));
	   AirlineName.selectByVisibleText("Unified Airlines");
	   AirlineName.selectByIndex(2);
	   System.out.println("Unified Airlines");
	   
	   
	   //----------------CONTINUE-----------//
	   
	   
	   WebElement countinue        = driver.findElement(By.name("findFlights"));
       countinue.click();
       System.out.println("CONTINUE");
       
       
       //--------------DEPART----------------//
       
       
       //==========Sydney to New York========//
       WebElement BlueSkiesAirlines360DEPART = driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$360$270$5:03']"));
       WebElement BlueSkiesAirlines361DEPART = driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$361$271$7:10']"));
       WebElement PangaeaAirlines362DEPART = driver.findElement(By.xpath("//input[@value='Pangea Airlines$362$274$9:17']"));
       WebElement UnifiedAirlines363DEPART = driver.findElement(By.xpath("//input[@value='Unified Airlines$363$281$11:24']"));
       
       PangaeaAirlines362DEPART.click();
       
       System.out.println("Pangaea Airlines 362");
       
       //-----------RETURN-------------------//
       //======New York to Sydney============//
       
       WebElement BlueSkiesAirlines360RETURN = driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$630$270$12:23']"));
       WebElement BlueSkiesAirlines361RETURN = driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$631$273$14:30']"));
       WebElement PangaeaAirlines362RETURN = driver.findElement(By.xpath("//input[@value='Pangea Airlines$632$282$16:37']"));
       WebElement UnifiedAirlines363RETURN = driver.findElement(By.xpath("//input[@value='Unified Airlines$633$303$18:44']"));
       BlueSkiesAirlines361RETURN.click();
       System.out.println("Blue Skies Airlines 361");
       
       //----------------CONTINUE-----------//
	   
	   
	   WebElement countinueReserve  = driver.findElement(By.name("reserveFlights"));
	   countinueReserve.click();
       System.out.println("countinue Reserve");
       
       
     //-----------PASSENGERS INFO-----------//
       
       
       driver.findElement(By.name("passFirst0")).sendKeys("Alay");
       driver.findElement(By.name("passLast0")).sendKeys("Lad");
       Select Meal= new Select(driver.findElement(By.name("pass.0.meal")));
       Meal.selectByVisibleText("Vegetarian");
	   Meal.selectByIndex(9);
	   driver.findElement(By.name("passFirst1")).sendKeys("Dhaval");
       driver.findElement(By.name("passLast1")).sendKeys("Lad");
       Select Meal2= new Select(driver.findElement(By.name("pass.1.meal")));
       Meal2.selectByVisibleText("Bland");
	   Meal2.selectByIndex(1);
	   
	 //-----------CREDIT CARD INFO-----------//  
	   
	   Select creditCard= new Select(driver.findElement(By.name("creditCard")));
	   creditCard.selectByVisibleText("Visa");
	   creditCard.selectByIndex(2);
	   driver.findElement(By.name("creditnumber")).sendKeys("1234567890");
	   //expiration Date
	   Select expMonth= new Select(driver.findElement(By.name("cc_exp_dt_mn")));
	   expMonth.selectByVisibleText("06");
	   expMonth.selectByIndex(6);
	   
	   Select expYear= new Select(driver.findElement(By.name("cc_exp_dt_yr")));
	   expYear.selectByVisibleText("2004");
	   expYear.selectByIndex(6);
	  
	   // Name On card
	   
	   driver.findElement(By.name("cc_frst_name")).sendKeys("Alay");
       driver.findElement(By.name("cc_mid_name")).sendKeys("H");
       driver.findElement(By.name("cc_last_name")).sendKeys("Lad");
       
       
       WebElement ticketLess= driver.findElement(By.name("ticketLess"));
       ticketLess.click();
       
       
       //-----------Billing Address INFO-----------//
       
       
       driver.findElement(By.name("billAddress1")).clear();
       driver.findElement(By.name("billAddress1")).sendKeys("123 Asdrgefg Avf");
       driver.findElement(By.name("billCity")).clear();
       driver.findElement(By.name("billCity")).sendKeys("BRAMPTON");
       driver.findElement(By.name("billState")).clear();
       driver.findElement(By.name("billState")).sendKeys("ONTARIO");
       driver.findElement(By.name("billZip")).clear();
       driver.findElement(By.name("billZip")).sendKeys("12345");
      
       Select country= new Select(driver.findElement(By.name("billCountry")));
	   country.selectByVisibleText("UNITED STATES ");
	   country.selectByIndex(214);
       
	   
	   //-----------Billing Address INFO-----------//
	   
	   driver.findElement(By.name("delAddress1")).clear();
	   driver.findElement(By.name("delAddress1")).sendKeys("567 qrtuiop Avf");
	   driver.findElement(By.name("delCity")).clear();
       driver.findElement(By.name("delCity")).sendKeys("AJEX");
       driver.findElement(By.name("delState")).clear();
       driver.findElement(By.name("delState")).sendKeys("ONTARIO");
       driver.findElement(By.name("delZip")).clear();
       driver.findElement(By.name("delZip")).sendKeys("67890");
      
       Select delcountry= new Select(driver.findElement(By.name("delCountry")));
       delcountry.selectByVisibleText("UNITED STATES ");
       delcountry.selectByIndex(214);
       
       WebElement purchase  = driver.findElement(By.name("buyFlights"));
       purchase.click();
       System.out.println("done");
      
	}
	
	
}
