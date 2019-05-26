import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HashtableCallTest extends TestUtilFile {
	
	private static int rowCount;
	private static int colCount;
	
	
	@Test(dataProvider = "getData1")
	public void testRunHashTable(Hashtable<String,String> data){
	 
		TestFile file = new TestFile();
		
		
		
		
		/*Class cl = TestFile.class;
		TestFile tf1 = new TestFile();
	    Method[] methods = cl.getMethods();
		//System.out.println(methods);
		
		   for (Method method : methods) { 
			   
               String MethodName = method.getName(); 
               if(MethodName.equalsIgnoreCase(data.get("TestCases"))){
            	   
               }
               System.out.println("Name of the method: "+ MethodName); 
           } */
	
	}
	
	
	
	
	
	
	
	
	
	@DataProvider
	public static Object[][] getData1(){
		excel = new ExcelReader("C:\\Users\\lenovo\\Desktop\\Java\\Selenium Webdriver\\projects\\TestProject\\src\\test\\resources\\TestSuit.xlsx");
		String sheetName = "Suit";
		rowCount = excel.getRowCount(sheetName);
		colCount = excel.getColumnCount(sheetName);
		System.out.println(rowCount+"and "+colCount);
		Object[][] data = new Object[rowCount-1][1]; 
		Hashtable<String,String> table = null;
		for(int rows=1;rows<rowCount;rows++){
			table = new Hashtable<String,String>();
			for(int cols=0;cols<colCount;cols++){				
				table.put(excel.getCellData(sheetName,cols,1),excel.getCellData(sheetName,cols,rows));
			    data[rows-1][0] = table;
			}
		}
		return data;
	}
}
