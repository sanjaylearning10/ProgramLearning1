public class CheckStringAreValid {
    public static void main(String...args)
    {
       // String s ="hello 1 people welcome to2 java world3";
        String s ="hello 1 people welcome to@ java world3";
        char[] array=s.toCharArray();
        boolean flag=false;

        for( int i=0;i<array.length;i++)
        {
            if((array[i]>=97 &&(int)array[i]<=122) || ((int)array[i]>=65 &&(int)array[i]<=90)
                    ||(int)array[i]>=48 &&(int)array[i]<=57 ||(int)array[i]<=32) {
                flag=true;
            }
            else
            {
                flag=false;
                break;
            }
        }

            System.out.println("String is validity is: " + flag);

    }
}
