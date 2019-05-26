import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;


public class TestListner extends TestListenerAdapter {
    
	TestUtilFile tuf = new TestUtilFile();
	
	
	
	
	public void onTestFailure(ITestResult tr){
		 System.out.println("Test Failure");
		 File scrFile = ((TakesScreenshot)tuf.driver).getScreenshotAs(OutputType.FILE);
		 try {
			FileUtils.copyFile(scrFile, new File("C:\\Users\\lenovo\\Desktop\\Java\\Selenium Webdriver\\projects\\TestProject\\screenshot\\screenshot.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
