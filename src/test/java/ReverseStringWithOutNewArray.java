public class ReverseStringWithOutNewArray {
    public static void main(String...args)
    {
        String s ="hello world";
        char[] array=s.toCharArray();
        for( int i=array.length-1; i>-1;i--)
        {
            System.out.print(array[i]+" ");
        }
    }
}
