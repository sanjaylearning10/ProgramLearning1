import java.util.Arrays;

public class SelectionSort {
    public static void main(String...args) {
        int[] array={1,9,2,3,6,7,8,10,5,0,4};
        System.out.println("Array before Sorting::=> "+ Arrays.toString(array));
        for(int i=0;i<array.length-1;i++)
        {
            int min_idx=i;
            for(int j=i+1;j<array.length;j++)
            {
                if(array[min_idx]>array[j])
                {
                    min_idx=j;
                }
            }
            int temp=array[min_idx];
            array[min_idx]=array[i];
            array[i]=temp;
        }
        System.out.println("Array After Sorting::=> "+ Arrays.toString(array));
    }
}
