public class SpanOfArray {

    public static int Search(int[] array)
    {
        int max=array[0];
        int min=array[0];
        for (int i=0;i< array.length;i++)
        {
            if(array[i]<=min)
            {
                min=array[i];
            }
            else if(array[i]>=max)
            {
                max=array[i];
            }

        }
        System.out.println("min"+min);
        System.out.println("max"+max);
        return max-min;
    }
    public static void main(String...args)
    {
        int[] array={1,9,2,3,6,7,8,10,5,4};
        System.out.println(Search(array));
    }
}
