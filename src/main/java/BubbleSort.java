import java.util.Arrays;

public class BubbleSort {
    public static void main(String...args)
    {
        int[] array={1,9,2,3,6,7,8,10,5,0,4};
        System.out.println("Array before Sorting::=> "+ Arrays.toString(array));

        for(int i=0;i<array.length-1;i++)
        {
            for(int j=0;j<array.length-1-i;j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println("Array before Sorting::=> "+ Arrays.toString(array));
    }
}
