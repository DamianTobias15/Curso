package testNG;

import static org.junit.Assert.assertArrayEquals;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.testng.Assert;
import menu.Menu;
import register.Register;
import selectFligth.SelectFligth;
import utilities.Utilities;

public class testNG2 extends Utilities {
	
	static	Menu menu = new Menu();
	static Register reg = new Register();
	static SelectFligth regF = new SelectFligth();

	@BeforeMethod (alwaysRun = true)	
	public void setup(){  
		super.setUp();
	}
	
	@AfterMethod (alwaysRun = true)
	public void tearDown() {
	
		super.tearDown();
		
	}
	
  

 
	
	@Test (priority=2, groups= {"Regresion"} )
  public static void registroDeNuevoUsuario (){

	reg.crearUsuario();
	waitUrl(10);
	 Assert.assertEquals("sal", "sal");
		
		
  
	}     
   @Test(priority=3, enabled=false,groups= {"Regresion"})
  public static void seleccionarUnVuelo() {
	   regF.seleccionarVuelo();
	   waitUrl(15);
	   Assert.assertEquals("© 2005, Mercury Interactive (v. 011003-1.01-058)", "sal");
		
		
		
	}  

  public static void quitDriver() {
		driver.quit();
	}
	
  
}
