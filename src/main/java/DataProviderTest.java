import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest extends TestUtilFile {
	//public static ExcelReader excel = null;
	@Test(dataProvider="getData")
	public void testWithDataProvider(String row,String col){
		
		//System.out.println(row);
		//System.out.println(col);
	}
	
	
	
	
	@DataProvider
	public static Object[][] getData(){
		excel = new ExcelReader("C:\\Users\\lenovo\\Desktop\\Java\\Selenium Webdriver\\projects\\TestProject\\src\\test\\resources\\TestSuit.xlsx");
		String sheetName ="Suit";
		
		int rowCount = excel.getRowCount(sheetName);
		//System.out.println(rowCount);
		int colCount = excel.getColumnCount(sheetName);
		//`System.out.println(colCount);
		Object[][] data = new Object[rowCount-1][colCount];
		for(int rows=2;rows<rowCount;rows++){
			for(int col=0;col<colCount;col++){
				data[rows-2][col] = excel.getCellData(sheetName, col, rows);
			}
		}
		
		for(Object[] b:data){
			for(Object x: b){
				System.out.println(x);
			}
			
		}
		return data;
		
	}

}
