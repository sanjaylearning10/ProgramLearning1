public class PalindromeStringUsingRecursion {

    public static String reverse(String str,String rev, int i)
    {
        if(i<0)
        {
            return rev;
        }
        return reverse(str,rev+str.charAt(i),i-1);
    }
    public static boolean palindromString(String str, String rev)
    {
        if (str.equals(rev))
            return true;
        return false;
    }
    public static void main(String...args){

        String str="madam";
        String reverseString =reverse(str,"",str.length()-1);
        System.out.println(palindromString(str,reverseString));
    }
}
