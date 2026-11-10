public class ConvertBinaryToDecimal1 {

    public static int Decimal(String num) {
         int sum=0;
         int powOf2=1;

        for(int i=num.length()-1;i>=0;i--)
        {
            if (num.charAt(i)=='1')
            {
                sum=sum+powOf2;
            }
            powOf2=powOf2*2;
        }
        return sum;
    }

    public static void main(String...args)
    {
        System.out.println(Decimal("100000"));

    }
}
