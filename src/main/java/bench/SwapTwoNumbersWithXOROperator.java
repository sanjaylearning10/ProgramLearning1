package bench;

public class SwapTwoNumbersWithXOROperator {
    public static void main(String...args)
    {
        int a=20;
        int b=30;
        System.out.println("Numbers before swap: "+ a+" and "+ b);

        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("Numbers after swap: "+ a+" and "+ b);
    }
}
