public class SecondLargestNumber {

    public static int secondLNumber(int[] array)
    {
        int num=0;
        int sec=0;
        if(array[0]<array[1]){
            sec=array[0];
            num=array[1];
        }
        else {
            sec=array[1];
            num=array[0];
        }
        for (int i=2;i<array.length;i++)
        {
         if(array[i]>num)
         {
             sec=num;
             num=array[i];
         } else if (array[i]>sec) {
            sec=array[i];
         }
        }
        return sec;
    }

    public static void main(String...args)
    {
        int[] array={1,2,3,4,5,6,7,8,9,10};
        System.out.println(secondLNumber(array));
    }
}
