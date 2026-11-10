public class FloorAndCeilArrayBinarySearch {

    public static int floorArray(int[] array,int low, int high,int num) {

            while (low<=high)
            {
                int mid=(low+high)/2;
                if (array[mid]==num)
                {
                    return array[mid];
                }
                else if(array[mid]<num)
                {
                    low=mid+1;
                    high=high;
                }
                else if(array[mid]>num)
                {
                    low=low;
                    high=mid-1;
                }
            }
        if (high>=0)
        return
                array[high];
        else
            return -1;
    }
    public static int ceilArray(int[] array,int low, int high,int num) {
        while (low<=high)
        {
            int mid=(low+high)/2;
            if (array[mid]==num)
            {
                return array[mid];
            }
            else if(array[mid]<num)
            {
                low=mid+1;
                high=high;
            }
            else if(array[mid]>num)
            {
                low=low;
                high=mid-1;
            }
        }
        if (low<array.length)
            return
                    array[low];
        else
            return -1;
    }
    public static void main(String...args)
    {
        int[] array={11,22,33,44,55,66,77,88,99,100,200};
        int num=1722;
       // System.out.println(floorArray(array,0, array.length-1,num));
        System.out.println(ceilArray(array,0, array.length-1,num));
    }

}
