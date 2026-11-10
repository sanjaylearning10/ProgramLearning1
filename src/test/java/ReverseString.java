public class ReverseString {
    public static void main(String...args)
    {
        String s ="hello world";
        char[] array=s.toCharArray();
        char[] reverseArray=new char[array.length];
        int j=0;
        for( int i=array.length-1; i>-1;i--)
        {
            reverseArray[j]=array[i];
            j++;
        }
        for (int i=0;i<reverseArray.length;i++){
            System.out.print(reverseArray[i]+" ");
        }
    }
}
