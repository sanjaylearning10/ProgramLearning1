public class NaturalNumbePrintRecurssion {

    public static void natural(int n)
    {
        if( n==1) {
            System.out.print("1"+" ");
            return;
        }
         natural(n-1);
        System.out.print(n+" ");

    }
    public static void main(String...args)
    {
       natural(10);
    }
}
