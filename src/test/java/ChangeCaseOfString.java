public class ChangeCaseOfString {
    public static void main(String...args)
    {
        String s ="heLlO WorlD";
        char[] array=s.toCharArray();

        for( int i=0;i<array.length;i++)
        {
            if((int)array[i]>=97 &&(int)array[i]<=122) {
                int intCharacter = array[i] - 32;
                System.out.print(" " + (char) intCharacter);
            } else if ((int)array[i]>=65 &&(int)array[i]<=90) {
                int intCharacter = array[i] + 32;
                System.out.print(" " + (char) intCharacter);
            }
        }
    }
}
