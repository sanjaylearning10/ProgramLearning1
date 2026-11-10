import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class LonlelyInteger_Collection {

    public static int lInterger(int[] array)
    {
        HashSet<Integer> hashSet =new HashSet<>();

        for (int i=0;i<array.length;i++)
        {
            if(!hashSet.contains(array[i]))
            {
                hashSet.add(array[i]);
            }
            else {
                hashSet.remove(array[i]);
            }
        }
        Iterator<Integer> itr=hashSet.iterator();
        while (itr.hasNext()) {
            return itr.next();
        }
        return -1;
    }
    public static void main(String...args)
    {
        int[] array={4,5,3,2,1,3,2,6,1,4,5,7,7};
        System.out.println(lInterger(array));
    }
}
