public class BinarySearch {

    public static void binarySearchPrint(int[] array,int low, int high, int num)
    {
        while (low<=high)
        {
            int mid=(low+high)/2;
            if(array[mid]==num)
            {
                System.out.println("Element found at location::  "+mid);
                break;
            }
            else if (array[mid]<num)
            {
                low=mid+1;
                high=high;
            }
            else if(array[mid]>num)
            {
                high=mid-1;
                low=low;
            }
            else
                System.out.println("Element not found");
        }
    }
    public static int binarySearch(int[] array,int low, int high, int num)
    {
        while (low<=high)
        {
            int mid=(low+high)/2;
            if(array[mid]==num)
            {
                return mid;
            }
            else if (array[mid]<num)
            {
                low=mid+1;
            }
            else if(array[mid]>num)
            {
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String...args){
        int[] array={0,1,2,3,4,5,6,7,8,9,10};
       System.out.println( binarySearch(array,0,array.length-1,3));
    }
}
