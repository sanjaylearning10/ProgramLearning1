public class ConvertDecimalToBinary {

    public static String Binary(int num) {
        String b = "";
        int x = 0;

        while (num>=1){
        x = num % 2;
        num = num / 2;
        b = x+b ;
    }
        return b;
    }

    public static void main(String...args)
    {
        System.out.println(Binary(45));

    }
}
