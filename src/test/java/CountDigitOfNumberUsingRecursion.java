public class CountDigitOfNumberUsingRecursion {

    public static int Sum(int num)
    {
        int result=0;
      if(num==0) {
          return 0;
      }

        result = result+1 ;
        return result+ Sum(num/10);
    }

    public static void main(String...args)
    {
       System.out.println( Sum(123));
    }
}
