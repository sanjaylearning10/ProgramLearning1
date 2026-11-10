public class RecurssionWithOutBase {


    public static void func(int n)
    {

        System.out.println(n);
        func(n-1);
    }
    public static void main(String...args)
    {
        func(3);
    }
}
