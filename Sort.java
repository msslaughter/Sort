package sort;

import java.util.*;

public class Sort
{
    public static <T extends Comparable <? super T>> int quicksort(T[] ar)
    {   
        Random rand = new Random();
        
        int opCount = 0;
        
        quicksort(ar, 0, ar.length -1, rand, opCount);
        
        return opCount;
    }
    
    
    private static <T extends Comparable <? super T>> void
        quicksort(T[] ar, int begin, int end, Random rand, int opCount)
    {   
        int pivotIndex = partition(ar, begin, end, begin + rand.nextInt(end + 1), opCount);
        quicksort(ar, begin, pivotIndex - 1, rand, opCount);
        quicksort(ar, pivotIndex + 1, end, rand, opCount);
        
    }
    
    
    //NEEDS TRACING, LIKELY OFF BY ONE OR SOMETHING
    private static <T extends Comparable <? super T>> int 
        partition(T[] ar, int begin, int end, int randomValue, int opCount)
    {
        T temp, pivotValue = ar[randomValue];
        int low = begin + 1, high = end;
        
       ar[randomValue] = ar[begin];
       ar[begin] = pivotValue;
        
       while(ar[low].compareTo(pivotValue) < 1)
       {
           low++;
           opCount++;
       }
       while(ar[high].compareTo(pivotValue) > 0)
       {
           high--; 
           opCount++;
       }
       
       while(low < high)
        {
            if(ar[low].compareTo(pivotValue) > -1 && ar[high].compareTo(pivotValue) < 0)
            {
                temp = ar[low];
                ar[low] = ar[high];
                ar[high] = temp;
                low++;
                high--;
                opCount++;
            }
            else if(ar[low].compareTo(pivotValue) > -1 && !(ar[high].compareTo(pivotValue) < 0))
            {
                high--;
                opCount++;
            }
            else if(!(ar[low].compareTo(pivotValue) > -1) && ar[high].compareTo(pivotValue) < 0)
            {
                low++;
                opCount++;
            }
        }
        
        
        return  low;
    }
}
    