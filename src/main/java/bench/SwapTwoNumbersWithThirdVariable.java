package bench;

public class SwapTwoNumbersWithThirdVariable {
    public static void main(String...args)
    {
        int a=20;
        int b=30;
        System.out.println("Numbers before swap: "+ a+" and "+ b);
        swap(a,b);
        System.out.println("Numbers after swap: "+ a+" and "+ b);
    }
    static void swap(int x, int y)
    {
        int temp;
        temp=x;
        x=y;
        y=temp;

    }
}

/*
    int temp;
        temp=a;
                a=b;
                b=temp;
                System.out.println("Numbers after swap: "+ a+" and "+ b);


 */