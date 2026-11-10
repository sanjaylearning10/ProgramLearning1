public class NaturalNumbeSumRecurssion {

    public static int natural(int n)
    {
        if( n==1)
            return 1;
        return n+natural(n-1);

    }
    public static void main(String...args)
    {
       System.out.println( natural(10));
    }
}
