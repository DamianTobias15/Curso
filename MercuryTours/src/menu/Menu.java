package menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utilities;

public class Menu extends Utilities  {
	
	// Metodos de menu Horizontal 
	
	public WebElement mnuRegisterLink () {
		
		return driver.findElement(By.linkText("REGISTER"));
		
		
	}
	

}
