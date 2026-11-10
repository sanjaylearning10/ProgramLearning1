public class NumberPowerOf2 {
    public static boolean powerOfTwo(int num)
    {
        if(num==0)
            return false;
        else
            return (num&(num-1))==0;
    }
    public static void main(String...args)
    {
        System.out.println(powerOfTwo(128));
        System.out.println(powerOfTwo(256));
        System.out.println(powerOfTwo(250));
    }
}
