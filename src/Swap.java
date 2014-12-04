
public class Swap {
  public static void main (String args[]){
	  Test alpha = new Test(1);
	  Test beta  = new Test(2);
	  
	  System.out.println("alpha = " + alpha.a);
	  System.out.println("beta = " + beta.a);
	  
	  alpha.swap(alpha, beta);
	  
	  System.out.println("alpha = " + alpha.a);
	  System.out.println("beta = " + beta.a);
  }
}

class Test {
	int a;
	Test (int i) { a = i; }
	
	void swap (Test objA, Test objB){
		int swp = objA.a;
		objA.a = objB.a;
		objB.a = swp;
	}
}

