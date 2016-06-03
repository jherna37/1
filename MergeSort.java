public class MergeSort
{
   public static void main(String []args)
   {
      int[] first = new int[]{1,3,5,7,9};
      int[] second = new int[]{2,4,6,8,10};
      
      merge(first,second) ;
   
   }

     public static int[] merge(int[] a, int[] b) {

    int[] answer = new int[a.length + b.length];
    int i = 0, j = 0, k = 0;
    while (i < a.length && j < b.length)
    {
        if (a[i] < b[j])
        {
            answer[k] = a[i];
            i++;
        }
        else
        {
            answer[k] = b[j];
            j++;
        }
        k++;
    }

    while (i < a.length)
    {
        answer[k] = a[i];
        i++;
        k++;
    }

    while (j < b.length)
    {
        answer[k] = b[j];
        j++;
        k++;
    }

    return answer;
}    
}