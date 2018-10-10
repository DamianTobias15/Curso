package run;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;

import menu.Menu;
import register.Register;
import selectFligth.SelectFligth;
import utilities.Utilities;
import vuelos.RegistroVuelos;
import jxl.Sheet;
import jxl.Workbook;
import org.testng.annotations.BeforeMethod;


public class Run extends Utilities  {
	
	static	Menu menu = new Menu();
	static Register reg = new Register();
	static RegistroVuelos regV = new RegistroVuelos();
	static SelectFligth regF = new SelectFligth();
	
	static Select s;
	 static WebElement element;
	 


	 
		
	public static void main(String[] args)  {
		openURL();
		register();
		registerFly();
		closeDriver();
		quitDriver();
		
		
		  
	}
	
	public static void openURL(){
		driver.get("http://newtours.demoaut.com/index.php");
		  
	}
	
	 
	
/*	public static void loggin() {
		
		try {

			Workbook workbook  = Workbook.getWorkbook(new File("C:\\Automation\\MercuryTours.xls")); //Pasamos el excel que vamos a leer
			Sheet sheet = workbook.getSheet("Login"); //Seleccionamos la hoja que vamos a leer
		
			String userName; 
		
				for (int fila = 1; fila < sheet.getRows(); fila++) { //recorremos las filas
					 //agregar  los elementos del login
					  * crearlos en la clase de register fly o crear una clase para login
					  * 
						
						

		
	}*/
	public static void register() {
		//lectura del excel
			menu.mnuRegisterLink().click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		try {

			Workbook workbook  = Workbook.getWorkbook(new File("C:\\Automation\\Mercury.xls")); //Pasamos el excel que vamos a leer
			Sheet sheet = workbook.getSheet("Register"); //Seleccionamos la hoja que vamos a leer
		
			String firstName; 
			System.out.print(sheet.getRows());
		
			//garantiza las mismas condicones como la primera dentro del mismo ciclo
			
				for (int fila = 1; fila < sheet.getRows(); fila++) { //recorremos las filas
					menu.mnuRegisterLink().click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
					
						reg.firstName().sendKeys(sheet.getCell(1, fila).getContents());
						reg.lastName().sendKeys(sheet.getCell(2, fila).getContents());
						reg.phone().sendKeys(sheet.getCell(3, fila).getContents());
						reg.email().sendKeys(sheet.getCell(4, fila).getContents());
						reg.city().sendKeys(sheet.getCell(5, fila).getContents());
						reg.state().sendKeys(sheet.getCell(6, fila).getContents());
						reg.code().sendKeys(sheet.getCell(7, fila).getContents());
						reg.userName().sendKeys(sheet.getCell(9, fila).getContents());
						reg.password().sendKeys(sheet.getCell(10, fila).getContents());
						reg.password().sendKeys(sheet.getCell(10, fila).getContents());
						reg.submit().click();
							
					}
			
		}catch(Exception e){
			System.out.println(e.getMessage());
			}
	////////// termina el codigo de lectura de Excel
			
		  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  //menu.mnuRegisterLink().click();
		  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  /*
		  try {
			  reg.firstName().click();
			  reg.firstName().sendKeys("NO funciona ¡¡");
		         
			  reg.lastName().click();
			  reg.lastName().sendKeys("Tobias");
		  
			
		  
			  reg.phone().click();
			  reg.phone().sendKeys("4159335");
		  
			  reg.email().click();
			  reg.email().sendKeys("damia12@hotmail.com");
		  
			  reg.adress().click();
			  reg.adress().sendKeys("San Angel 240");
		  
			  reg.city().click();
			  reg.city().sendKeys("Saltillo");
		  
			  reg.state().click();
			  reg.state().sendKeys("Saltillo");
		  
			  reg.code().click();
			  reg.code().sendKeys("25290");
		  
			  combo("country","MEXICO");
		  /*reg.country().click();
		  reg.country().sendKeys("Mexico");
		  
			  reg.userName().click();
			  reg.userName().sendKeys("Javier");
		  
			  reg.password().click();
			  reg.password().sendKeys("javier17");
		  
			  reg.Ccontraseña().click();
			  reg.Ccontraseña().sendKeys("javier17");
		  
			  reg.submit().click();
		
		  	}catch (Exception e) {
			  System.out.println(e.getMessage());
	           }*/
	}
		
	public static void registerFly() {
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
	

public static void selectFly() {
	
	regF.Depart("Blue Skies Airlines$360$270$5:03");
	regF.Return("Blue Skies Airlines$630$270$12:23");
	regF.continuePageSelectFligth().click();
	
}
	
	public static void closeDriver() {
		driver.close();
	
	
	}
	public static void quitDriver() {
		driver.quit();
	}
}
