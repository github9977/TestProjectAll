import java.lang.reflect.Method;

public class MethodTest {
	
	public boolean testMethod(Method m){
		
		if(m.getName().equals("CountNotification")){
		return true;
		}
		return false;
	}
}
