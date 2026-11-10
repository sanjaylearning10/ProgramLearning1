package bench;

public class ReverseInteger {
    public static void main(String[] args) {
        int num=9062025;
        int x;
        String reversNum="";

        while (num>0)
        {
            x=num%10;
            num=num/10;
            reversNum=reversNum+x;
        }
        System.out.print("Numbers in Reverse order are: "+ reversNum);
    }
}
