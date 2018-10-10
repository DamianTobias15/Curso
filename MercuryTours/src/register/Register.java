package register;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import menu.Menu;
import utilities.Utilities;

public class Register extends Utilities {
	static Register reg = new Register();
	static	Menu menu = new Menu();
	
	public WebElement firstName () {
		
		return driver.findElement(By.name("firstName"));
		
	}

	public WebElement lastName () {
	
		return driver.findElement(By.name("lastName"));
	
	
	}

	public WebElement phone () {
		return driver.findElement(By.name("phone"));
		
	}
	
	public WebElement email () {
		return driver.findElement(By.name("userName"));
		
	}
	
	
	public WebElement adress () {
		return driver.findElement(By.name("address1"));
	
	}
	
	public WebElement city () {
		return driver.findElement(By.name("city"));
	
	}
	
	public WebElement state () {
		return driver.findElement(By.name("state"));
	
	}
	
	public WebElement code () {
		return driver.findElement(By.name("postalCode"));
	
	}
	
	
	public WebElement country () {
		return driver.findElement(By.name("country"));
	
	}
	
	
	public WebElement userName () {
		return driver.findElement(By.name("email"));
	
	}
	
	public WebElement password () {
		return driver.findElement(By.name("password"));
	
	}
	
	public WebElement Ccontraseña () {
		return driver.findElement(By.name("confirmPassword"));
	
	}
	
	public WebElement submit () {
		return driver.findElement(By.name("register"));
	
	}
	
	public WebElement vuelos () {
		return driver.findElement(By.linkText("Flights"));
	
	}
	
	///Ations ///
	
	public void crearUsuario () {
		
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  menu.mnuRegisterLink().click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  try {
		  firstName().click();
		  firstName().sendKeys("NO funciona ¡¡");
	         
		  lastName().click();
		  lastName().sendKeys("Tobias");
	  
		
	  
		  phone().click();
		  phone().sendKeys("4159335");
	  
		  email().click();
		  email().sendKeys("damia12@hotmail.com");
	  
		  adress().click();
		  adress().sendKeys("San Angel 240");
	  
		  city().click();
		  city().sendKeys("Saltillo");
	  
		  state().click();
		  state().sendKeys("Saltillo");
	  
		  code().click();
		  code().sendKeys("25290");
	 
		  combo("country","MEXICO");
	  country().click();
	  country().sendKeys("Mexico");
	  
		  userName().click();
		  userName().sendKeys("Javier");
	  
		  password().click();
		  password().sendKeys("javier17");
	  
		  Ccontraseña().click();
		  Ccontraseña().sendKeys("javier17");
	  
		  submit().click();
	
	  	}catch (Exception e) {
		  System.out.println(e.getMessage());
         }
		
	}
	
}

