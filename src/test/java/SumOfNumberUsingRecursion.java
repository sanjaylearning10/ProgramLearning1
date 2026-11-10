public class SumOfNumberUsingRecursion {

    public static int Sum(int num)
    {
        int result=0;
      if(num==0) {
          return 0;
      }

        result = num % 10 +Sum(num/10);
        return result;
    }

    public static void main(String...args)
    {
       System.out.println( Sum(123456));
    }
}
