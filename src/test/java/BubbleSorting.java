import java.util.Arrays;

public class BubbleSorting {

    public static void bubbleSort(int[] array)
    {
        boolean flag;
        for(int i=0;i<array.length-1;i++)
        {
            flag=false;
            for (int j=0;j<array.length-1-i;j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    flag=true;
                }
            }
            if (!flag)
            {
                break;
            }
        }
    }
    public static void main(String...args)
    {
       //int[] array={2,0,8,9,3,4,6,7,10,5,1};
        int[] array={0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       System.out.print(Arrays.toString(array));
       bubbleSort(array);
       System.out.print(Arrays.toString(array));
    }
}
