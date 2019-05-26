import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

public class TestFile extends FunctionDef {
	
	
	public void CountNotification(){
		System.out.println("Test  Successfull");
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		driver.get("https://www.google.com/");
		try {
			captureScreenshot(methodName);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

public void quickHelpTest(){
	btnClick(2,"quickHelp");
	countOptionsQuickHelp();

	
}
	
	

	
	public void LoginFB() throws IOException{	
		
		//runModes=runMode("tcName1");
		//if(runModes){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		captureScreenshot(methodName);
	    textBox(2, 3);
	    textBox(4, 5);
	    driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
	    btnClick(6,"LoginFB");
	    driver.navigate().back();
	    driver.navigate().forward();
	    btnClick(7,"LoginFB");
	    captureScreenshot(methodName);
	    //btnClick(8,"LoginFB");
	    captureScreenshot(methodName);
	    boolean modeTC = runMode("tcName1");
		System.out.println(modeTC);
		driver.quit();
		}/*else{
			throw new SkipException("Skipping - This is not ready for testing ");
		}*/
	//}
	
public void checkHotelcountOptions(){
	    //String methoName = m.getName();
	   // System.out.println("Method name is "+methoName);
		
		driver.get("https://www.makemytrip.com/cabs/");

		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		//Alert alert = driver.switchTo().alert();
		//alert.accept();
		String sheetName = "checkHotelcountOptions";
		
		btnClick(2,sheetName);
		int i=0;
		lst = new ArrayList<String>();
		set = new HashSet<WebElement>();
		while(isElementPresent("//div[@id='moreOpt']/p["+(++i)+"]")){
			//System.out.println("Check In");
			
			lst.add(driver.findElement(By.xpath("//div[@id='moreOpt']/p["+i+"]")).getText());
			set.add(driver.findElement(By.xpath("//div[@id='moreOpt']/p["+i+"]")));
			iterate = lst.iterator();
			//System.out.println("Checkout");
			//System.out.println(lst.size());
			//System.out.println(i);
			while(iterate.hasNext()){
				System.out.println("With Interator inside "+iterate.next());
				//WebElement el = (WebElement) iterate.next();
				//System.out.println(el.getText());
			}
			
			
			
		}
		
		for(int j=0;j<lst.size();j++){
			
			System.out.println(lst.get(j));
		}
		
		countOptions = i;
		
				
	}
  
  public void elementClickHolidays(){
	int sizeOFset = set.size();
	
	
	
	m.getName();
	Iterator iterateSet = set.iterator();
	System.out.println("Size Of Set is "+sizeOFset);
	for(int z=0;z<sizeOFset;z++){
		
		while(iterateSet.hasNext()){
			System.out.println("IteratorSet "+iterateSet.next());
			   
	   }
	}
}
  
  public void checkRadioButton(){
		propOR = new Properties();
		try {
			fisOR = new FileInputStream("C:\\Users\\lenovo\\Desktop\\Java\\Selenium Webdriver\\projects\\TestProject\\src\\main\\resources\\OR.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			propOR.load(fisOR);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  excel = new ExcelReader("C:\\Users\\lenovo\\Desktop\\Java\\Selenium Webdriver\\projects\\TestProject\\src\\test\\resources\\TestSuit.xlsx");
	  String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
	  runURL();
	  System.out.println(excel.getCellData(methodName, "Action", 3));
		String getOR1 = excel.getCellData(methodName, "Action", 3);
		System.out.println(propOR.getProperty(getOR1));
		//String xPathCombo = propOR.getProperty(getOR1);
	  WebElement element = driver.findElement(By.xpath(propOR.getProperty(getOR1)));
	  dropDown(element,methodName,2);
	  String getOr2 = excel.getCellData(methodName, "Action", 4);
	  String getOr3 = excel.getCellData(methodName, "Action", 5);
	  
	  radioCheckBx(getOr2);
	  radioCheckBx(getOr3);
	  
  }
  
  public void windowsProjectFor2(){
	  propOR = new Properties();
		try {
			fisOR = new FileInputStream("C:\\Users\\lenovo\\Desktop\\Java\\Selenium Webdriver\\projects\\TestProject\\src\\main\\resources\\OR.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			propOR.load(fisOR);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	  runURL();
	  windows2Handle(propOR.getProperty("openNewWind"),propOR.getProperty("classNewWind"));
  }
  
  public void testMouseMove(){
	  
		propDetails = new Properties(); 
		try {
			fisDetails = new FileInputStream("C:\\Users\\lenovo\\Desktop\\Java\\Selenium Webdriver\\projects\\TestProject\\src\\main\\resources\\Details.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			propDetails.load(fisDetails);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	  mouseMovement(driver,propDetails.getProperty("url"),"//span[@class='arrow arrowDown']");
	  
  }
  
  public void testMouseMoveAlert(){

	    
		propDetails = new Properties(); 
		try {
			fisDetails = new FileInputStream("C:\\Users\\lenovo\\Desktop\\Java\\Selenium Webdriver\\projects\\TestProject\\src\\main\\resources\\Details.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			propDetails.load(fisDetails);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		propOR = new Properties();
		try {
			fisOR = new FileInputStream("C:\\Users\\lenovo\\Desktop\\Java\\Selenium Webdriver\\projects\\TestProject\\src\\main\\resources\\OR.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			propOR.load(fisOR);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	  
		alertMouseMove(propDetails.getProperty("url"),propOR.getProperty("mvMouse"));
	  
} 
  


	
}
