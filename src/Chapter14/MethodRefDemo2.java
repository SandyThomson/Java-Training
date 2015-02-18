package Chapter14;

public class MethodRefDemo2 {
	
  public static void main(String args[]) 
  { 
    boolean result; 
 
    MyIntNum myNum = new MyIntNum(12); 
     
    // Here, a method reference to isFactor on myNum is created. 
    IntPredicate ip = myNum::hasCommonFactor; 
 
    // Now, it is used to call isFactor() via test(). 
    result = ip.test(8); 
    if(result) System.out.println("8 shares a factor with " + myNum.getNum()); 
 
  } 

}
