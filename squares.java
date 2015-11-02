public class squares
{
  public static void main(String args[])
  { 
   double[] squares = new double[100];
    for(int x=0; x<100; x++)
    {
     squares[x] = x*x; 
     }
    for(int x=0; x<100; x++)
    {
       for(int i =0; i<100; i++)
          {
          if(Math.sqrt(squares[i]*squares[x])%1 != 0)
             System.out.println("Something is wrong");
          }
     }  
   }
    
}
