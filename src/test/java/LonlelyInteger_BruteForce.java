import java.util.Arrays;

public class LonlelyInteger_BruteForce {

    public static int lInterger(int[] array)
    {
        System.out.println("Array Before sorting");
        System.out.print(Arrays.toString(array)+" ");
        System.out.println();
        Arrays.sort(array);
        System.out.println("Array after sorting");
        System.out.print(Arrays.toString(array)+" ");
        System.out.println();
        for(int i=0;i<array.length-2;i=i+2)
        {
            if(array[i]!=array[i+1])
                {
                    return array[i];
                }
        }
        return array[array.length-1];
    }
    public static void main(String...args)
    {
        int[] array={4,5,3,2,1,3,2,6,1,4,5,7,7};
        System.out.println(lInterger(array));
    }
}
