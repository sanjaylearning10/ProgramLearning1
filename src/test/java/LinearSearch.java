public class LinearSearch {

    public static int Search(int[] array, int num)
    {
        for (int i=0;i< array.length;i++)
        {
            if (array[i]==num)
            {
                System.out.println("Searched number "+ array[i]+" found at "+i);
                return i;
            }
        }
        return -1;
    }
    public static void main(String...args)
    {
        int[] array={1,9,2,3,6,7,8,10,5,4};
        System.out.println(Search(array,70));
    }
}
