public class CountWordsInString {
    public static void main(String...args)
    {
        String s ="hello people welcome to java world";
        char[] array=s.toCharArray();
        int numSpace=0;

        for( int i=0;i<array.length;i++)
        {
            if((int)array[i]==32 ) {
                numSpace=numSpace+1;
            }
        }
        System.out.println("Number of words in string are " + (numSpace+1));
    }
}
