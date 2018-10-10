package selectFligth;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import menu.Menu;
import register.Register;
import utilities.Utilities;
import vuelos.RegistroVuelos;


public class SelectFligth extends Utilities {
	
	static	Menu menu = new Menu();
	static Register reg = new Register();
	static RegistroVuelos regV = new RegistroVuelos();
	static SelectFligth regF = new SelectFligth();

	static Select s;
	static WebElement element;
	
	public void  Depart  (String outFlight) {
		
		 optionButton ( "outFlight", "Blue Skies Airlines$360$270$5:03" ) ;
	
	}

	public void  Return (String inFlight) {
		
		 optionButton ( "inFlight", "Blue Skies Airlines$630$270$12:23" ) ;
	
	}
	
	public  WebElement continuePageSelectFligth () {
		return driver.findElement(By.name("reserveFlights"));
		
	
	}
	
	public void seleccionarVuelo () {
	/////seleccionaron del vuelo 
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		reg.vuelos().click();
		  
		regV.typeTrip();
		 
		  
		element = driver.findElement(By.name("passCount"));
	//((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", element);

	        s = new Select (element);
	        s.selectByVisibleText("2");
			
	        regV.departingFrom("Frankfurt");
	        
	        
	        regV.mesOn("August");
	        regV.day("25");
	        regV.arrivingIn("Sydney");
	        regV.mesLlegada("May");
	        
	        regV.serviceClass("First");
	        regV.continuePage().click();

	        
	             
		
	}


}
