public class prime
{
   public static boolean checkPrime(double x)
{
    if(x<2) return false;
    else {
      for(int i=2; i<x; i++)
	{
         if(checkEven(x/i))
            {
            System.out.println(x + " is Not a Prime Number");
            return false;  
            }
        } 
         System.out.println(x + " is prime yo");
         return true;
          } 
}
  public static boolean checkEven(double x) 
     {
       int i = (int) x; //integer version of double 
       if(x>i)
          return false;
       else            
           return true;
     }
  public static void main(String[] args) {
     for(int x =0; x <100; x++)
        checkPrime(x);
}
} 
