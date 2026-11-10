package bench;

public class SwapTwoNumbersWithMathOperator {
    public static void main(String...args)
    {
        int a=20;
        int b=30;
        System.out.println("Numbers before swap: "+ a+" and "+ b);

        b=a+b-(a=b);
        System.out.println("Numbers after swap: "+ a+" and "+ b);
    }
}
