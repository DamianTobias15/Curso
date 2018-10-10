package vuelos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import register.Register;
import utilities.Utilities;

public class RegistroVuelos extends Utilities {
	
	Select s;
	WebElement element;
	
//	FLIGT DETAILS
		public void  typeTrip () {
			
			 optionButton ( "tripType", "oneway" ) ;
		
		}
	
	
		public void departingFrom (String seleccionarValor) {
			myCombo("fromPort",seleccionarValor);
				 
			
			
		}
		

		public void  mesOn  (String seleccionarMes) {
			myCombo("fromMonth" ,seleccionarMes);
			 
			
			
		}
		
		public void day  (String seleccionarDia) {
			myCombo("fromDay",seleccionarDia);
			
		}
		
		public void arrivingIn  (String selectToPort) {
			myCombo("toPort",selectToPort);
			
		}
		
		public void mesLlegada  (String selectMonth) {
			myCombo("toMonth",selectMonth);
			
			
		}
		
		public void diaLlegada  (String selectDay) {
			myCombo("toDay",selectDay);
			
		}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
	//PREFERENCE
		public void  serviceClass (String selectClass) {
			
			 optionButton ( "servClass", selectClass ) ;
		
		}
		
	/*	public void airline() {
			
			
			
		}*/
		
		
		public  WebElement continuePage () {
			return driver.findElement(By.name("findFlights"));
			
		
		}
		
///////////////////////////////////////////////////////////////////////////////
		//select fligth
		
		
}
