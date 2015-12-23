
public class  threeXPlusOne {
   public static void main(String[] args) {
   if(test(2432234)) System.out.println("It works");
}
   //wont ever return false if thereom is true
   public static boolean test(long x) {
      
      if(x==1){ System.out.println("Took " +count+ " steps");
                return true;}
      if(x%2==0) x /= 2;
      else x = 3*x+1;
      count += 1;
      return test(x);
}
public static int count=0;
}
