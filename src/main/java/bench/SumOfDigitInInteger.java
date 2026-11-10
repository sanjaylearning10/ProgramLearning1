package bench;

public class SumOfDigitInInteger {
    public static void main(String[] args) {
        int num=9062025;
        int sum=0;
        int x;

        while (num>0)
        {
            x=num%10;
            num=num/10;
            sum=sum+x;
        }
        System.out.print("Sum of all digits is "+ sum);
    }
}
