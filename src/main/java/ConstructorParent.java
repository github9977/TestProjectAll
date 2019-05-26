
public class ConstructorParent {
	
	int a;
	int b;
	
	public ConstructorParent(int j, int k){
		this.a = j;
		this.b=k;
	}
	
	public ConstructorParent(){
		
		System.out.println("Program ends here");
		ConstructorParent cp = new ConstructorParent(1,2);
	    System.out.println(cp.a+" and "+cp.b);
	}
	
	

}
