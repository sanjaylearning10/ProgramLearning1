public class CountDigitInNumber {
    public static void main(String...args)
    {
    System.out.println(countNumber(999));
    }

    public static int countNumber(int num)
    {
       int count =0;
        while (num>0)
        {
            count=count+1;
            num=num/10;

        }
        return count;
    }
}
