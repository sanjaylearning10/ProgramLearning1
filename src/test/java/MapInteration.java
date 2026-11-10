import java.util.HashMap;
import java.util.Map;

public class MapInteration {

    public static void main(String...args)
    {
        Map<Integer,Integer> hashMap=new HashMap<>();

        for(int i=0;i<10;i++)
        {
            hashMap.put(i,i);
        }
        hashMap.forEach((k,v)->System.out.println(k+" "+v));

    }
}
