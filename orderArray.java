  

public class orderArray 
 {
  
         public static void main(String[] args) {

                int[] array = {15,24,242,44,2342,1312,55,324,534,234}; //array to sort
                sortArray(array);
                betterSort(array); 
                lowestSort(array); 
                
             for(int x=0; x<array.length; x++)

                System.out.println("" + array[x]);
          }

         public static void sortArray(int[] array) //sorts an array by checking in the order that the array is given if the int in front of the current value is less than the current value
            {                                      //if this is true it  will move each int over 1 and check again

            int[] sorted = new int[array.length];
            int x = 1;
            sorted[0] = array[0];

            for(int i=1; i<array.length; i++)
              {
               x =1;
               while(array[i]<sorted[i-x]) //is current value greater than the value to its left
                {
                  sorted[i-x+1] = sorted[i-x]; //move the value to the right 
                  sorted[i-x] = array[i]; //current array value replaces previous sorted array value
                  x++;                    //shows how far the array value moves
                }
               sorted[i-x+1]= array[i];

                  
              }
            for(int i =0; i<sorted.length; i++) System.out.println("" + sorted[i]); //prints sorted array
            }

          public static void betterSort(int[] array) //not actually better doesnt sort every array .                        
            { 
             int current;
           
             for(int x=0; x<array.length-1; x++) //checks to see if each value is greater than the one to its right if it is switch the values
               {
                if(array[x] > array[x+1])
                   {
                   current = array[x];
                   array[x] = array[x+1];
                   array[x+1] = current;
                   }           
                } 
             for(int x=array.length-1; x>0; x--) //checks to see if each value is less than the one to its left if it is switch the values
               {
                if(array[x]<array[x-1])
                  {
                   current = array[x];
                   array[x] = array[x-1];
                   array[x-1] = current;
                  }
                }
              for(int x=0; x<array.length; x++)
                  System.out.println(" " + array[x]);
              }
     
           public static void averageSort(int[] array)
             {  
               int average=0;
               for(int x=0; x<array.length; x++)
                 { average =+ array[x];}
               average = average/array.length;
                   
              }
          public static void lowestSort(int[] array) //finds the lowest value of all the values and adds it to the front and repeats 
            {
            int lowest;
            for(int x=0; x<array.length; x++)
               {
               lowest=array[x];
               for(int i=x; i<array.length; i++)
                {  
                  if(lowest>array[i])
                   lowest=array[i];
                 }
               array[x]=lowest;
                }
             for(int x=0; x<array.length; x++)
                System.out.println("" + array[x]);
             }  
 }

