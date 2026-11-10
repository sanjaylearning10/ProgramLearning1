public class SumDigitInNumber {
    public static void main(String...args)
    {
    System.out.println(sumNumber(9998));
    }

    public static int sumNumber(int num)
    {
       int sum =0;
        while (num>0)
        {
            sum=sum+num%10;
            num=num/10;

        }
        return sum;
    }
}
