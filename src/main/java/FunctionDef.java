import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringMouse;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;




public class FunctionDef extends TestUtilFile implements FunctionFile   {

	
    	
	public void runURL() {
 
		
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
		
		String urlSite = (String) propDetails.get("url");
		String browserSet = propDetails.getProperty("browser");
		if(browserSet.equalsIgnoreCase("firefox")){
		driver = new FirefoxDriver();
		}else if(browserSet.equalsIgnoreCase("chrome")){
			String exePath = "C:\\Users\\lenovo\\Desktop\\Java\\Selenium Webdriver\\projects\\TestProject\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			driver = new ChromeDriver();
		}else if(browserSet.equalsIgnoreCase("ie")){
			String exePath = "C:\\Users\\lenovo\\Desktop\\Java\\Selenium Webdriver\\projects\\drivers\\IEDriver.exe";
			System.setProperty("webdriver.ie.driver", exePath);
			driver = new InternetExplorerDriver();
		}else {
			String exePath = "C:\\Users\\lenovo\\Desktop\\Java\\Selenium Webdriver\\projects\\drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);
			try {
				RemoteWebDriver rdriver = new RemoteWebDriver(new URL("http://localhost/wd/hub"),cap);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		driver.get(urlSite);
		}

	public void textBox(int num, int num1) {
		
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
		String sheetName = "LoginFB";
		String oR = excel.getCellData(sheetName, 2, num);
		String lNm= excel.getCellData(sheetName, 2, num1);
		System.out.println(excel.getCellData(sheetName, 2, num));
		System.out.println(excel.getCellData(sheetName, 2, num1));
		String loginXp = propOR.getProperty(oR);
		String loginText = propDetails.getProperty(lNm);
		element = driver.findElement(By.xpath(loginXp));
		element.sendKeys(loginText);
		
		
	}

	public void btnClick(int num,String sheetName) {
		//String sheetName = "LoginFB";
		String oR1 = excel.getCellData(sheetName, "Action", num);
		System.out.println(excel.getCellData(sheetName, "Action", num));
        if(sheetName.equalsIgnoreCase("checkHotelcountOptions")){
        	element = driver.findElement(By.xpath("//li[@class='latoBlack moreItem ']/span/span[3]"));
        	element.click();
		}else {
		//String oR = propOR.getProperty("clickMoreCab");
		//System.out.println(oR);
		element = driver.findElement(By.xpath(propOR.getProperty(oR1)));
		element.click();
	}
	
	
	
	}

	
	public boolean runMode(String tcName) {
		
		String testName = propDetails.getProperty(tcName);
		System.out.println(testName);
		String suitSheet = "Suit";
		int countSuit  = excel.getRowCount(suitSheet);
		
		System.out.println(countSuit);
		//int rows = 1;
		for(int rows = 1;rows<=countSuit;rows++) {
		String testCase = excel.getCellData(suitSheet, "TestCases", rows);
		if(testCase.equalsIgnoreCase(testName)){
			String mode = excel.getCellData(suitSheet, "RunMode", rows);
			if(mode.equalsIgnoreCase("Y")){
				System.out.println(rows);
				return true;
				
			}else{
				
				
				return false;
			}
			
			
			
		}
	
		
		
		
		System.out.println(rows);
		}
		
		return false;
	}

	
	
	public void countOptionsQuickHelp(){
		
		String xpath1 = propOR.getProperty("quickHlpParent");
		int i=1;
		//String xPath2 = "/child::li["+i+"]/a/div";
		while(isElementPresent(xpath1+"/child::li["+i+"]/a/div")){
			ArrayList<WebElement> ali = new ArrayList<WebElement>();
			ali.add(driver.findElement(By.xpath(xpath1+"/child::li["+i+"]/a/div")));
			Iterator iterate = ali.iterator();
			while(iterate.hasNext()){
				System.out.println("Test Check countOptions");
				System.out.println(iterate.next());
			}
			i=i+1;
			
		}
		
	}

	public void dropDown(WebElement element,String sheetName,int rowNum) {
		
		
		Select select = new Select(element);
		List<WebElement> valuesElement = select.getOptions();
		int sizeOfCombo = valuesElement.size();
		for(int j=1;j<sizeOfCombo;j++){
		System.out.println(valuesElement.get(j).isSelected());
		System.out.println("Values of Drop Down are " + valuesElement.get(j).getText());
		
	
		
		}
		if(sheetName.equalsIgnoreCase("checkRadioButton")){
		System.out.println("Default selected values are "+select.getFirstSelectedOption().getText());
		select.selectByVisibleText("Jul");
		select.selectByIndex(2);
		}else{
			System.out.println("Other Test");
		}
		
	}

	public void radioCheckBx(String or) {
	
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
		
		WebElement elementRadio = driver.findElement(By.xpath(propOR.getProperty(or)));
		if(!elementRadio.isSelected())
		elementRadio.click();
		
		
	}

	public void windows2Handle(String xPath,String className) {

		windows = driver.getWindowHandles();
		iterateWindows = windows.iterator();
		WebElement elementCheckWindow = driver.findElement(By.xpath(xPath));
		elementCheckWindow.click();
		
		windows = driver.getWindowHandles();
		iterateWindows = windows.iterator();
		//driver.switchTo().window(arg0)
		String mainWindow = (String) iterateWindows.next();
		String secondWindows = (String) iterateWindows.next();
		driver.manage().timeouts().implicitlyWait(20L,TimeUnit.SECONDS);
		driver.switchTo().window(secondWindows);
		WebElement fbTest = driver.findElement(By.className(className));
		fbTest.click();
		windows = driver.getWindowHandles();
		iterateWindows = windows.iterator();
		//driver.switchTo().window(arg0)
		String mainWindow1 = (String) iterateWindows.next();
		String secondWindows1 = (String) iterateWindows.next();
		String ThirdWindow2 = (String) iterateWindows.next();
		System.out.println("WndowIDS are "+mainWindow1+" "+secondWindows1+" "+ThirdWindow2);
		driver.manage().timeouts().implicitlyWait(10L,TimeUnit.SECONDS);
		driver.switchTo().window("ThirdWindow2");
	    
	
	
	
	}
	
	public void openFireFoxProfile(){
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
		String profileName = propDetails.getProperty("proFile");
		iniProfile = new ProfilesIni();
        firefox = iniProfile.getProfile(profileName);
        WebDriver driver = new FirefoxDriver(firefox);
	    driver.get("https://www.guru99.com/firefox-profile-selenium-webdriver.html");
		
	}
	
	public void mouseMovement(WebDriver driver,String url,String className){
		
	String exePath = "C:\\Users\\lenovo\\Desktop\\Java\\Selenium Webdriver\\projects\\TestProject\\chromedriver.exe";
		
	    System.setProperty("webdriver.chrome.driver", exePath);
	    driver = new ChromeDriver();	
		WebListners listners = new WebListners();
	    EventFiringWebDriver eveDriver = new EventFiringWebDriver(driver);
	    eveDriver.register(listners);
	    eveDriver.get("https://www.makemytrip.com/");
	    eveDriver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
	    EventFiringMouse mouse = new EventFiringMouse(eveDriver,listners);
	    waitf = new FluentWait(driver);
	    waitf.pollingEvery(20L, TimeUnit.SECONDS);
	    Locatable locate = (Locatable)driver.findElement(By.xpath("//span[@class='arrow arrowDown']"));
	    Coordinates cord = locate.getCoordinates();
	    mouse.mouseMove(cord);
	
	}

	public void alertMouseMove(String url,String xPath) {
		
		driver.get(url); 
		Actions action = new Actions(driver);
		wait = new WebDriverWait(driver,20L);
		action.moveToElement(driver.findElement(By.xpath(xPath))).perform();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("chNavText")));	
	}

	public void acceptRejectAlerts(String req) {
		alert = driver.switchTo().alert();
		System.out.println("alert is"+alert.getText());
		if(req.equalsIgnoreCase("accept")){
		
		
		alert.accept();
		}else if(req.equalsIgnoreCase("reject")){
			alert.dismiss();	
		}
	
	}

	public void calendarFunction(String Date) {
		cal = Calendar.getInstance();
		int firstInd = Date.indexOf("/");
		int lastInd  = Date.lastIndexOf("/");
		currentDay = cal.get(Calendar.DAY_OF_MONTH);
		currentMonth = cal.get(Calendar.MONTH);
		currentYear = cal.get(Calendar.YEAR);
		targetDay = Integer.parseInt(Date.substring(0, firstInd));
		targetMonth = Integer.parseInt(Date.substring(firstInd+1, lastInd));
		targetYear = Integer.parseInt(Date.substring(lastInd+1, Date.length()));
		if(currentDay>targetDay){
			jumpDay = currentDay - targetDay; 
		}else if(targetDay>currentDay){
			jumpDay = targetDay - currentDay;
		}else {
			jumpDay = 0;
		}
	    
		if(currentMonth>targetMonth){
			jumpDay = currentMonth - targetMonth; 
		}else if(targetMonth>currentMonth){
			jumpDay = targetMonth - currentMonth;
		}else {
			jumpDay = 0;
		}
		
		System.out.println("currentDay is "+ currentDay);
		System.out.println("currentMonth is "+ currentMonth);
		System.out.println("currentYear is "+ currentYear);
		System.out.println("targetDay is "+ targetDay);
		System.out.println("targetMonth is "+ targetMonth);
		System.out.println("targetYear is "+ targetYear);
	 
	}


}




	
	



