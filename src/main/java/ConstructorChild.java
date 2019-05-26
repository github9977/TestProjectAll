
public class ConstructorChild extends ConstructorParent{
	int c;
	int k;
	public ConstructorChild(){
		System.out.println("test constructores");
	}

	public static void main(String[] args) {
		//ConstructorChild cc = new ConstructorChild();
		ConstructorParent cp1 = new ConstructorChild();// upcasting calls only parent
		ConstructorChild cp2 =  (ConstructorChild)cp1;// downcasting calls both parent and child
	
	  
	}
}
