import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Hashtable;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringMouse;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestUtilFile {
	
	
	
	public static boolean runModes;
	public static Properties propDetails = null;
	public static FileInputStream fisDetails = null;
	public static WebDriver driver = null;
	public static Properties propOR = null;
    public static FileInputStream fisOR = null;
    public static ExcelReader excel = null;
    public static WebElement element = null;
    public static String imageName;
	public static String imageNameIP;
	public static String imageError;
	public static String subject;
	public static String from_date=null;
	public static String to_date=null;
	public static monitoringMail mail = null;
	public static TestConfig tc = null;
	public static ArrayList<String> lst = null;
	public static Iterator iterate = null;
	public static int countOptions = 0;
	public static int i = 0;
	public static Set<WebElement> set = null;
	public static Hashtable<Integer,WebElement> ht = null;
	public static Method m=null;
	public static  Set<String> windows = null;
    public static Iterator iterateWindows = null;
    public static ProfilesIni iniProfile = null;
    public static FirefoxProfile firefox = null; 
    public static WebListners listners = null;
    public static EventFiringWebDriver eveDriver = null;
    public static EventFiringMouse mouse = null;
    public static Locatable locate = null;
    public static Coordinates cord = null;
    public static WebDriverWait wait = null;
    public static FluentWait waitf = null;
    public static FluentWait<WebDriver> waitff = null;
    public static Alert alert = null;// needs to check diff between this and other usage like in mouse move
    public static Calendar cal = null;
    public static int currentDay = 0;
    public static int currentMonth = 0;
    public static int currentYear = 0;
    public static int targetDay = 0;
	public static int targetMonth = 0;
	public static int targetYear = 0;
	public static int jumpDay = 0;
	public static int jumpMonth = 0;
	public static int jumpYear = 0;


	/*public void TestUtilFile(ArrayList<WebElement> lst,Iterator iterate){
		this.lst=lst;
		this.iterate = iterate;
		
	}*/
	public static boolean isElementPresent(String xPAth){
		
		
		
		if(driver.findElements(By.xpath(xPAth)).size()!=0){
			return true;
		}else
		
		return false;
		
		
	}
	//public static Mail mail = null;
    
public static void captureScreenshot(String MethodName) throws IOException{
		
		Calendar cal = new GregorianCalendar();
		  int month = cal.get(Calendar.MONTH);
		  int year = cal.get(Calendar.YEAR);
		  int sec =cal.get(Calendar.SECOND);
		  int min =cal.get(Calendar.MINUTE);
		  int date = cal.get(Calendar.DATE);
		  int day =cal.get(Calendar.HOUR_OF_DAY);
	      String ImageDest = "C:\\Users\\lenovo\\Desktop\\Java\\Selenium Webdriver\\projects\\TestProject\\screenshot\\";
		
	      imageName = ImageDest+MethodName+year+"_"+date+"_"+(month+1)+"_"+day+"_"+min+"_" +sec;
		  //selenium.captureEntirePageScreenshot(imageName+ ".jpeg"," ");
		  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		  FileUtils.copyFile(scrFile, new File(imageName+".jpg"));
	      	      
	}

public static void zip(String filepath){
 	try
 	{
 		File inFolder=new File(filepath);
 		File outFolder=new File("Reports.zip");
 		ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(outFolder)));
 		BufferedInputStream in = null;
 		byte[] data  = new byte[1000];
 		String files[] = inFolder.list();
 		for (int i=0; i<files.length; i++)
 		{
 			in = new BufferedInputStream(new FileInputStream
 			(inFolder.getPath() + "/" + files[i]), 1000);  
 			out.putNextEntry(new ZipEntry(files[i])); 
 			int count;
 			while((count = in.read(data,0,1000)) != -1)
 			{
 				out.write(data, 0, count);
 			}
 			out.closeEntry();
}
out.flush();
out.close();
 	
}

 	catch(Exception e)
{
  e.printStackTrace();
} 
}	


    //public static Logger log = null;
}
                                                                                                                                                                       
