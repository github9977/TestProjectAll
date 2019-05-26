import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface FunctionFile {
	
	public void runURL();
	public void textBox(int num, int num2);
	public void btnClick(int num,String sheetName);
	public boolean runMode(String tcName);
	public void dropDown(WebElement element,String sheetName,int rowNum);
	
	public void radioCheckBx(String or);
	public void windows2Handle(String xPath,String className);
	public void openFireFoxProfile();
	public void mouseMovement(WebDriver driver,String url,String className);
	public void alertMouseMove(String url,String xPath);
	public void acceptRejectAlerts(String req);
	public void calendarFunction(String Date);


    //public boolean isElementPresent(String xpath);



}
