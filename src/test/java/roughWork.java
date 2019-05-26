import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.Select;





public class roughWork extends TestUtilFile {
	
	public static int i=3;
	public static int j=1;
	public static String mainXpath=null;
	public static List<WebElement> elmnt = null;

	
	public static boolean isElementPresent1(String xpath){
		System.out.println(xpath);
		if(driver.findElements(By.xpath(xpath)).size()!=0){
			return true;
		}else
		
		return false;
		
		
	}
	

	public static void main(String[] args) {
		
		String exePath = "C:\\Users\\lenovo\\Desktop\\Java\\Selenium Webdriver\\projects\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
       	driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22481/dc-vs-rcb-46th-match-indian-premier-league-2019");
		
		String xPath = "//div[@id='innings_1']";
		String xPath1 = "/div/div[";
		String xPath2 = "]";
		String xPath3 = "/div[";
		mainXpath = xPath+xPath1+i+xPath2+xPath3+j+xPath2;
		System.out.println(xPath+xPath1+i+xPath2+xPath3+j+xPath2);
		
	   
	    
	    	for(j=1;j<=7;j++){
	    		if(j==1){
	    			mainXpath = xPath+xPath1+i+xPath2+xPath3+j+xPath2+"/a";
	    		}else if(j==2){
	    			mainXpath = xPath+xPath1+i+xPath2+xPath3+j+xPath2+"/span";
	    		}else{
	    			mainXpath = xPath+xPath1+i+xPath2+xPath3+j+xPath2;
	    		}
	    		System.out.println(driver.findElement(By.xpath(mainXpath)).getText());
	    		System.out.println(mainXpath);
	    		 while(isElementPresent(mainXpath)){
	    			 elmnt = new ArrayList<WebElement>();
	    			 elmnt.add(driver.findElement(By.xpath(mainXpath)));
	    			 System.out.println(elmnt.get(i-1).getText());
	    			 ++i;
	    		 }
	    			
	    	}
	    	    
	}

}