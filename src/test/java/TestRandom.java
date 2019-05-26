import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.apache.log4j.Logger;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;


public class TestRandom extends TestUtilFile{
	
	
	ErrorCollectorTestNG ect = new ErrorCollectorTestNG();
	TestFile file = new TestFile();
	FunctionDef fd = new FunctionDef();
	
	Logger log = Logger.getLogger("devpinoyLogger");//"devpinoyLogger"
	
	@BeforeSuite
	public void beforeSuites(){
		System.out.println("Tests Begins");
		log.info("Starts Testing");
	}
	
	@BeforeTest
	public void beforeMethodOnly(){
		fd.runURL();
		log.debug("URL runs successfully");
	}
	
	
	
	@Test(priority=3)
	public void cNNotification() throws NoSuchMethodException, SecurityException, IOException{
		/*String x = "cNNotification";
        Method m = TestRandom.class.getMethod(x, String.class);*/
        //System.out.println("Method name is "+methodName);
		excel = new ExcelReader("C:\\Users\\lenovo\\Desktop\\Java\\Selenium Webdriver\\projects\\TestProject\\src\\test\\resources\\TestSuit.xlsx"); 
		String sheetName = "Suit";
		int rowCount = excel.getRowCount(sheetName);
		int colCount = excel.getColumnCount(sheetName);
		for(int rowzz=1;rowzz<rowCount;rowzz++){
			for(int colzz=0;colzz<colCount;colzz++){
			String fnName1="CountNotification";
				if(fnName1.equalsIgnoreCase(excel.getCellData(sheetName, colzz, rowzz))){
					int rowRunMode1 = rowzz;
					if(excel.getCellData(sheetName, "RunMode", rowRunMode1).equalsIgnoreCase("Y")){
						file.CountNotification();
						
					}else{
						System.out.println("Test Case is skipped");
						log.error("Test case is ignored");
						throw new SkipException("Test Case if Skipeed");
						
					}
					
				}
		
			}
		}
		
		
	}

	
	@Test(priority=1)
	public void testing() throws IOException{
		excel = new ExcelReader("C:\\Users\\lenovo\\Desktop\\Java\\Selenium Webdriver\\projects\\TestProject\\src\\test\\resources\\TestSuit.xlsx");
		String sheetName = "Suit";
		int rowCount = excel.getRowCount(sheetName);
		int colCount = excel.getColumnCount(sheetName);
		for(int rowz=1;rowz<rowCount;rowz++){
			for(int colz=0;colz<colCount;colz++){
			String fnName="LoginFB";
				if(fnName.equalsIgnoreCase(excel.getCellData(sheetName, colz, rowz))){
					int rowRunMode = rowz;
					if(excel.getCellData(sheetName, "RunMode", rowRunMode).equalsIgnoreCase("Y")){
						
						file.LoginFB();
					}else{
						System.out.println("Test Case is skipped");
						throw new SkipException("Test Case if Skipeed");
					}
					
				}
		
			}
		}
	}
	
	@Test(priority=2)
	public void getQuickHelpOptions() throws IOException{
		excel = new ExcelReader("C:\\Users\\lenovo\\Desktop\\Java\\Selenium Webdriver\\projects\\TestProject\\src\\test\\resources\\TestSuit.xlsx");
		String sheetName = "Suit";
		int rowCount = excel.getRowCount(sheetName);
		int colCount = excel.getColumnCount(sheetName);
		for(int rowz=1;rowz<rowCount;rowz++){
			for(int colz=0;colz<colCount;colz++){
			String fnName="quickHelp";
				if(fnName.equalsIgnoreCase(excel.getCellData(sheetName, colz, rowz))){
					int rowRunMode = rowz;
					if(excel.getCellData(sheetName, "RunMode", rowRunMode).equalsIgnoreCase("Y")){
						
						file.countOptionsQuickHelp();
					}else{
						System.out.println("Test Case is skipped");
						throw new SkipException("Test Case if Skipeed");
					}
					
				}
		
			}
		}
	}
	
	@AfterTest
	public void afterMethod(){
		
	try{
		
	}catch(Throwable t){
		ect.addVerificationFailure(t);
	}
		
	}
	
	@AfterSuite
	public void afterSuites() throws AddressException, MessagingException{
		String filepath = "C:\\Users\\lenovo\\Desktop\\Java\\Selenium Webdriver\\projects\\TestProject\\screenshot";
		zip(filepath);
		//mail = new monitoringMail();
		
		//tc = new TestConfig();
		//mail.sendMail(tc.server, tc.from, tc.to, tc.filepath, tc.messageBody ,tc.attachmentPath, tc.attachmentName);
		//mail.sendMail(mailServer, from, to, tc.filepath, messageBody, attachmentPath, attachmentName);
		log.info("Test Ends here");
		
		
	}
	
	@Test(priority=4)
	public void cabMMTOptions() throws NoSuchMethodException, SecurityException, IOException{
		/*String x = "cNNotification";
        Method m = TestRandom.class.getMethod(x, String.class);*/
        //System.out.println("Method name is "+methodName);
		excel = new ExcelReader("C:\\Users\\lenovo\\Desktop\\Java\\Selenium Webdriver\\projects\\TestProject\\src\\test\\resources\\TestSuit.xlsx"); 
		String sheetName = "Suit";
		int rowCount = excel.getRowCount(sheetName);
		int colCount = excel.getColumnCount(sheetName);
		for(int rowzz=1;rowzz<rowCount;rowzz++){
			for(int colzz=0;colzz<colCount;colzz++){
			String fnName1="checkHotelcountOptions";
				if(fnName1.equalsIgnoreCase(excel.getCellData(sheetName, colzz, rowzz))){
					int rowRunMode1 = rowzz;
					if(excel.getCellData(sheetName, "RunMode", rowRunMode1).equalsIgnoreCase("Y")){
						file.checkHotelcountOptions();
						
					}else{
						System.out.println("Test Case is skipped");
						log.error("Test case is ignored");
						throw new SkipException("Test Case if Skipeed");
						
					}
					
				}
		
			}
		}
		
		
		
		
	}
	
	@Test(priority=6)
	public void checkWindows() throws NoSuchMethodException, SecurityException, IOException{
		/*String x = "cNNotification";
        Method m = TestRandom.class.getMethod(x, String.class);*/
        //System.out.println("Method name is "+methodName);
		excel = new ExcelReader("C:\\Users\\lenovo\\Desktop\\Java\\Selenium Webdriver\\projects\\TestProject\\src\\test\\resources\\TestSuit.xlsx"); 
		String sheetName = "Suit";
		int rowCount = excel.getRowCount(sheetName);
		int colCount = excel.getColumnCount(sheetName);
		for(int rowzz=1;rowzz<rowCount;rowzz++){
			for(int colzz=0;colzz<colCount;colzz++){
			String fnName1="checkWindows";
				if(fnName1.equalsIgnoreCase(excel.getCellData(sheetName, colzz, rowzz))){
					int rowRunMode1 = rowzz;
					if(excel.getCellData(sheetName, "RunMode", rowRunMode1).equalsIgnoreCase("Y")){
						file.windowsProjectFor2();
					}else{
						System.out.println("Test Case is skipped");
						log.error("Test case is ignored");
						throw new SkipException("Test Case if Skipeed");
						
					}
					
				}
		
			}
		}
		
		
		
		
	
	
	}
	
	@Test(priority=5)
	public void testCombo() throws NoSuchMethodException, SecurityException, IOException{
		/*String x = "cNNotification";
        Method m = TestRandom.class.getMethod(x, String.class);*/
        //System.out.println("Method name is "+methodName);
		excel = new ExcelReader("C:\\Users\\lenovo\\Desktop\\Java\\Selenium Webdriver\\projects\\TestProject\\src\\test\\resources\\TestSuit.xlsx"); 
		String sheetName = "Suit";
		int rowCount = excel.getRowCount(sheetName);
		int colCount = excel.getColumnCount(sheetName);
		for(int rowzz=1;rowzz<rowCount;rowzz++){
			for(int colzz=0;colzz<colCount;colzz++){
			String fnName1="checkRadioButton";
				if(fnName1.equalsIgnoreCase(excel.getCellData(sheetName, colzz, rowzz))){
					int rowRunMode1 = rowzz;
					if(excel.getCellData(sheetName, "RunMode", rowRunMode1).equalsIgnoreCase("Y")){
						file.checkRadioButton();
						
					}else{
						System.out.println("Test Case is skipped");
						log.error("Test case is ignored");
						throw new SkipException("Test Case if Skipeed");
						
					}
					
				}
		
			}
		}
		
		
		
		
		
		
	
	}
	
	@Test(priority=8)
	public void testMoveMouse() throws NoSuchMethodException, SecurityException, IOException{
		/*String x = "cNNotification";
        Method m = TestRandom.class.getMethod(x, String.class);*/
        //System.out.println("Method name is "+methodName);
		excel = new ExcelReader("C:\\Users\\lenovo\\Desktop\\Java\\Selenium Webdriver\\projects\\TestProject\\src\\test\\resources\\TestSuit.xlsx"); 
		String sheetName = "suit";
		int rowCount = excel.getRowCount(sheetName);
		int colCount = excel.getColumnCount(sheetName);
		for(int rowzz=1;rowzz<rowCount;rowzz++){
			for(int colzz=0;colzz<colCount;colzz++){
			String fnName1="moveMouse";
				if(fnName1.equalsIgnoreCase(excel.getCellData(sheetName, colzz, rowzz))){
					int rowRunMode1 = rowzz;
					if(excel.getCellData(sheetName, "RunMode", rowRunMode1).equalsIgnoreCase("Y")){
						file.testMouseMove();
						
					}else{
						System.out.println("Test Case is skipped");
						log.error("Test case is ignored");
						throw new SkipException("Test Case if Skipeed");
						
					}
					
				}
		
			}
		}
		
		
		
		
		
		
	
	}
	
	@Test(groups={"test"})
	public void testCalendarFunction() throws NoSuchMethodException, SecurityException, IOException{
		/*String x = "cNNotification";
        Method m = TestRandom.class.getMethod(x, String.class);*/
        //System.out.println("Method name is "+methodName);
		excel = new ExcelReader("C:\\Users\\lenovo\\Desktop\\Java\\Selenium Webdriver\\projects\\TestProject\\src\\test\\resources\\TestSuit.xlsx"); 
		String sheetName = "suit";
		int rowCount = excel.getRowCount(sheetName);
		int colCount = excel.getColumnCount(sheetName);
		for(int rowzz=1;rowzz<rowCount;rowzz++){
			for(int colzz=0;colzz<colCount;colzz++){
			String fnName1="getCalendar";
				if(fnName1.equalsIgnoreCase(excel.getCellData(sheetName, colzz, rowzz))){
					int rowRunMode1 = rowzz;
					if(excel.getCellData(sheetName, "RunMode", rowRunMode1).equalsIgnoreCase("Y")){
						file.calendarFunction("21/05/2019");
						
					}else{
						System.out.println("Test Case is skipped");
						log.error("Test case is ignored");
						throw new SkipException("Test Case if Skipeed");
						
	
					}
					
				}
		
			}
		}
		
		
		
		
		
		
	
	}
	
	@Test(priority=10)
	public void testMoveMouseAlert() throws NoSuchMethodException, SecurityException, IOException{
		/*String x = "cNNotification";
        Method m = TestRandom.class.getMethod(x, String.class);*/
        //System.out.println("Method name is "+methodName);
		excel = new ExcelReader("C:\\Users\\lenovo\\Desktop\\Java\\Selenium Webdriver\\projects\\TestProject\\src\\test\\resources\\TestSuit.xlsx"); 
		String sheetName = "suit";
		int rowCount = excel.getRowCount(sheetName);
		int colCount = excel.getColumnCount(sheetName);
		for(int rowzz=1;rowzz<rowCount;rowzz++){
			for(int colzz=0;colzz<colCount;colzz++){
			String fnName1="testMouseMoveAlert";
				if(fnName1.equalsIgnoreCase(excel.getCellData(sheetName, colzz, rowzz))){
					int rowRunMode1 = rowzz;
					if(excel.getCellData(sheetName, "RunMode", rowRunMode1).equalsIgnoreCase("Y")){
						file.testMouseMove();
						
					}else{
						System.out.println("Test Case is skipped");
						log.error("Test case is ignored");
						throw new SkipException("Test Case if Skipeed");
						
					}
					
				}
		
			}
		}
		
		
		
		
		
		
	
	}
	
	@Test(priority=7)
	public void runProfile() throws NoSuchMethodException, SecurityException, IOException{
		/*String x = "cNNotification";
        Method m = TestRandom.class.getMethod(x, String.class);*/
        //System.out.println("Method name is "+methodName);
		excel = new ExcelReader("C:\\Users\\lenovo\\Desktop\\Java\\Selenium Webdriver\\projects\\TestProject\\src\\test\\resources\\TestSuit.xlsx"); 
		String sheetName = "Suit";
		int rowCount = excel.getRowCount(sheetName);
		int colCount = excel.getColumnCount(sheetName);
		for(int rowzz=1;rowzz<rowCount;rowzz++){
			for(int colzz=0;colzz<colCount;colzz++){
			String fnName1="openFireFoxTest";
				if(fnName1.equalsIgnoreCase(excel.getCellData(sheetName, colzz, rowzz))){
					int rowRunMode1 = rowzz;
					if(excel.getCellData(sheetName, "RunMode", rowRunMode1).equalsIgnoreCase("Y")){
						file.openFireFoxProfile();
					}else{
						System.out.println("Test Case is skipped");
						log.error("Test case is ignored");
						throw new SkipException("Test Case if Skipeed");
						
					}
					
				}
		
			}
		}
		
		
		
		
	
	
	}
	

}
