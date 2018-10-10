package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import jxl.Sheet;
import jxl.Workbook;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;







public class Utilities {
	
	JavascriptExecutor js;
	WebDriverWait varWait;

	public static WebDriver driver;
	 
	   /*static {
	    
	         driver = getDriver();
	     
	          }
	   
	  public static  WebDriver getDriver() {
	    
	    System.setProperty("webdriver.gecko.driver", "C:\\Automation\\Drivers\\BrowserDrivers\\geckodriver.exe");
	    											
	    FirefoxOptions dc = new FirefoxOptions(); //DesiredCapabilities.firefox();
	       dc.setCapability("marionette", true);
	   
	      driver =  new FirefoxDriver(dc); 
	      
	    return driver;
	     
	    
	  }*/
	
	  
	  public static Select combo (String name, String value ) {
		  
		  Select combo2= new Select(driver.findElement(By.name(name)));
		  
		 // /combo2.getOptions().size();
		 // System.out.println(combo2.getOptions().size());  
		  combo2.selectByVisibleText(value);
		  
		  
		  return combo2 ;
	  }
	  
	  public static void  optionButton (String name, String value )  {
		  
		  List<WebElement> objOptionButton = driver.findElements(By.name(name));
		 
			
			
			 boolean seleccionado = false;
			 
			 
			 
			 seleccionado = objOptionButton.get(0).isSelected();
			 
			 System.out.println(seleccionado);
			 
			 int cant = objOptionButton.size();
			 
				 
			 for(int i=0; i < cant ; i++ ){
			 
				 
				 String valor = objOptionButton.get(i).getAttribute("value");
			 
				
			     if (valor.equalsIgnoreCase(value)){
			 
					 objOptionButton.get(i).click();
			 
								 
					 break;
		  
				  }
		  
	  }
			  }	
	  
	  public static void myCombo(String name, String valorSeleccionar ) {
		 // System.out.println("mycombo");
		   Select combo= new Select(driver.findElement(By.name(name)));
		    
		  //  combo.getOptions().size();
		   // System.out.println(combo.getOptions().size());
		    
		   combo.selectByVisibleText(valorSeleccionar);
		//  ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", combo);
		  
		  //return combo;
		 }
	  
	  /*public  void myComboValue(String name, int valorSeleccionar ) {
		  
		   Select combo= new Select(driver.findElement(By.name(name)));
		    
		   // combo.getOptions().size();
		   // System.out.println(combo.getOptions().size());
		    
		   combo.selectByIndex( valorSeleccionar);
		  //((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", combo);
		  
		  //return combo;
		 }
	
	 /* public  int  returnMonth(String nameMonth) {

		 int  valueMonth = 0;
		 System.out.println(nameMonth);
		  switch (nameMonth ) {
		  
		  case "January" : 
			  valueMonth =0;
			  break;
			  
		  case "February" : 
			  valueMonth = 1;
			  break;
			  	  
			  
		  case "March" : 
			  valueMonth = 2;
			  break;
		  case "April" : 
			  valueMonth = 3;
			  break;	  
		  case "May" : 
			  valueMonth = 4;
			  break;  
		  case "June" : 
			  valueMonth = 5;
			  break;
		  case "July" : 
			  valueMonth = 6;
			  break;
		  case "August" : 
			  valueMonth = 7;
			  break;
		  case "September" : 
			  valueMonth = 8;
			  break;
		  case "Octuber" : 
			  valueMonth = 9;
			  break;
		  case "November" : 
			  valueMonth = 10;
			  break;
		  case "December" : 
			  valueMonth = 11;
			  break;
			  
			  
			  
		  
		  }
		  
		  System.out.println(valueMonth);
		  return valueMonth;
		   
		 
		  
		  
		 }
	  */
	 /* public static void mycombo2(String elementName,String textToSelect) {
		  System.out.println("mycombo2");
		  Select comboX= new Select(driver.findElement(By.name(elementName)));
		   
		   //comboX.getOptions().size();
		   System.out.println(comboX.getOptions().size());
		   System.out.print(textToSelect);
		   comboX.selectByVisibleText(textToSelect);
		   
		   
		 }*/
	  
	  
	/*  public static void  hojaParamitrazado(String NombreHoja,int Col,int Row) {	
		  

		  
		  
		  
			Workbook workbook  = Workbook.getWorkbook(new File("C:\\Automation\\Mercury.xls")); //Pasamos el excel que vamos a leer
			Sheet sheet = workbook.getSheet("Register"); //Seleccionamos la hoja que vamos a leer
	
		
		
}*/
			
	 // protected WebDriver driver;
		
		protected void setUp() {
			
			//firefox
			System.setProperty("webdriver.gecko.driver","C:\\Automation\\Drivers\\BrowserDrivers\\geckodriver.exe");		
		    FirefoxOptions dc = new FirefoxOptions(); //DesiredCapabilities.firefox();
	        dc.setCapability("marionette", true);
	
	       driver =  new FirefoxDriver(dc); 
	       driver.get("http://newtours.demoaut.com/index.php");
	       driver.manage().window().maximize(); // maximiza la pantalla por defec
	       
	       String driver_path = "C:\\Automation\\Drivers\\BrowserDrivers";

	     //  System.setProperty("webdriver.chrome.driver", driver_path);
			
			
			
	       //chrome
	       System.setProperty("webdriver.gecko.driver","C:\\Automation\\Drivers\\BrowserDrivers\\chromedriver.exe");				    		      

				       ChromeOptions options = new ChromeOptions();
				        options.setCapability("marionette", true);
				        driver = new ChromeDriver(options);
				        driver.get("http://newtours.demoaut.com/index.php");
				        driver.manage().window().maximize();
				        options.addArguments("--incognito");
					    options.addArguments("--start-maximized");

				       String driver_pathChrome = "C:\\Automation\\Drivers\\BrowserDrivers";
				       System.setProperty("webdriver.chrome.driver", driver_pathChrome);
				       
				       varWait = new WebDriverWait(driver, 10);
				       
			//InternetExplorer	       
			/*System.setProperty("webdriver.gecko.driver","C:\\Automation\\Drivers\\BrowserDrivers\\chromedriver.exe");
		    		      

				       ExploreOptions options = new ExploreOptions ();
				        options.setCapability("marionette", true);
				        driver = new ExploreDriver(options);
				        driver.get("http://newtours.demoaut.com/index.php");
				        driver.manage().window().maximize();

				       String driver_pathExplorer = "C:\\Automation\\Drivers\\BrowserDrivers";
				       System.setProperty("webdriver.chrome.driver", driver_pathExplorer);
				       
				       varWait = new WebDriverWait(driver, 10);*/
				       
		}
		
		protected void tearDown(){
			driver.close();
		}
		
		
		
public static void waitUrl(int time)	{

driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS); 
} 
	
}  
	  
	  
	  
	  
	  
	  
	  
	  

