import java.util.Arrays;

public class ReverseArray {

    public static void method1(int [] array)
    {
        int i=0;
        int j=array.length-1;
        int temp=0  ;
        while(i<=j)
        {
            temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(array));
    }
    public static void method2(int [] array)  {
         int temp= 0;
        for (int i=0;i<array.length/2;i++) {
             temp=array[i];
             array[i]=array[array.length-i-1];
             array[array.length-1-i]=temp;
        }
         System.out.println(Arrays.toString(array));
    }

    public static void method3(int[] array)
    {
        for (int i=array.length-1;i>=0;i--)
        {
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String...args)
    {
        int [] array ={100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
      //  method1(array);
        //method2(array);
         method3(array);
    }
}
