import java.util.Arrays;

public class RotateArrayUsingReverse {

    public static void reverseArray(int [] array,int low,int high)
    {
        int temp=0;
       while (low<high)
        {
            temp=array[low];
            array[low]=array[high];
            array[high]=temp;
            low++;
            high--;
        }
    }
    public static void rotateArray(int [] array,int k)
    {
       if (k>0) {
           k = k % array.length;
       }
       else {
           k=k+array.length;
       }
            reverseArray(array,0,k-1);
            reverseArray(array, k,array.length-1);
            reverseArray(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }

    public static void main(String...args)
    {
        int [] array ={100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
       rotateArray(array,-1);
    }
}
