    public class java 
{
  
        public static void main(String[] args) {

                int[] array = {15,24,242,44,2342,1312,55,324,534,234};
                sortArray(array);
            
                

          }
         public static int[] sortArray(int[] array)
{
            int[] sorted = new int[array.length];
            int x = 1;
            sorted[0] = array[0];
            for(int i=1; i<array.length; i++)
            {
               x =1;
               while(array[i]<sorted[i-x])
                {
                  sorted[i-x+1] = sorted[i-x];
                  sorted[i-x] = array[i];
                  x++;
                }
               sorted[i-x+1]= array[i];

                  
            }
            for(int i =0; i<sorted.length; i++) System.out.println("" + sorted[i]);
                    
            return sorted;
}
}

