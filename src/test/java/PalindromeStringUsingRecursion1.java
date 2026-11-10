public class PalindromeStringUsingRecursion1 {

    public static boolean reverse(String str,int i, int j)
    {

        if(str.charAt(i)!=str.charAt(j)) {
            return false;
        }
        if(i>j )
        {
            return true;
        }
        return reverse(str, i+1, j-1);
    }

    public static void main(String...args){
        String str="madam";
        System.out.println(reverse(str,0,str.length()-1));
    }
}
