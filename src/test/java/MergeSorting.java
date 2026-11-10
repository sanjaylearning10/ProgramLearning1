import java.util.Arrays;

public class MergeSorting {
    public static void mergeSort(int [] array, int low, int high)
    {
        if (low<high)
        {
           int  mid=(low+high)/2;
            mergeSort(array,low,mid);
            mergeSort(array,mid+1,high);
            mergeArray(array,low,mid,high);
        }
    }
    public static void mergeArray(int [] array, int low,int mid, int high)
    {
            int[] left=new int[mid-low+1];
            int[] right=new int[high-mid];

            for(int i=0;i<left.length;i++)
            {
                left[i]=array[low+i];
            }
            for(int i=0;i<right.length;i++)
            {
                right[i]=array[mid+1+i];
            }
                int i=0;
                int j=0;
                int k=low;
            while (i<left.length && j<right.length)
            {
                if(left[i]<=right[j])
                {
                    array[k]=left[i];
                    i++;
                    k++;
                }
                else
                {
                    array[k]=right[j];
                    j++;
                    k++;
                }
            }
        while (i<left.length ) {
                array[k] = left[i];
                i++;
                k++;
        }
        while (j<right.length)
        {
                array[k]=right[j];
                j++;
                k++;
        }
    }
    public static void main(String...args)
    {
        int[] array={2,0,8,9,3,4,6,7,10,5,1};
        System.out.print("Array before sorting");
        System.out.println(Arrays.toString(array));
        mergeSort(array,0,array.length-1);
        System.out.print("Array after sorting");
        System.out.println(Arrays.toString(array));
    }
}
