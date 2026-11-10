public class VowelInString {
    public static void main(String...args)
    {
        String s ="heLlO WorlD";
        char[] array=s.toCharArray();
        int countVowel=0;
        int countConsonent=0;

        for( int i=0;i<array.length;i++)
        {
            if(array[i]=='a'|| array[i]=='A'|| array[i]=='e'||array[i]=='I'||array[i]=='o'||array[i]=='O'||array[i]=='u'||array[i]=='U') {
                countVowel=countVowel+1;
                System.out.println("Vowel :" +  countVowel +"->"+array[i]);
            } else if((array[i]>=65 &&array[i]<=90)||(array[i]>=97 &&array[i]<=122)) {
                countConsonent=countConsonent+1;
                System.out.println("Consonent :"+countConsonent+"->"+array[i]);
            }
        }
    }
}
