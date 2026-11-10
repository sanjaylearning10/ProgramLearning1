import java.util.HashSet;
import java.util.Iterator;

public class LonlelyInteger_BitWiseOperator {

    public static int lInterger(int[] array)
    {
        int result=0;
        for(int i=0;i<array.length;i++)
        {
            result=result^array[i];
        }

        return result;

    }
    public static void main(String...args)
    {
        int[] array={4,5,3,2,1,3,2,6,1,4,5,7,7};
        System.out.println(lInterger(array));
    }
}
