public class ConvertBinaryToDecimal {

    public static double Decimal(String num) {
        double sum=0;
        String[] strArray=num.split("");
        for(int i=strArray.length-1;i>=0;i--)
        {
            if (Integer.parseInt(strArray[strArray.length-i-1])==1)
            {
                sum=sum+Math.pow(2,i);
            }
        }
        return sum;
    }

    public static void main(String...args)
    {
        System.out.println(Decimal("10000"));

    }
}
