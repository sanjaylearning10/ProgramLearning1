import java.util.Arrays;

public class RotateArray {

    public static void rotateArrayByOne(int [] array)
    {
        int temp=array[0]  ;
        for(int i=1;i<array.length;i++)
        {
            array[i-1]=array[i];
        }
        array[array.length-1]=temp;
       // System.out.println(Arrays.toString(array));
    }
    public static void rotateArray(int [] array,int k)
    {
       if (k>0) {
           k = k % array.length;
       }
       else {
           k=k+array.length;
       }
        for(int i=1;i<=k;i++)
        {
            rotateArrayByOne(array);
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String...args)
    {
        int [] array ={100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        rotateArray(array,-1);

    }
}
