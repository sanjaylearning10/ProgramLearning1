public class CompareString {
    public static void main(String...args)
    {
        String s ="Painter";
        String s1 ="Paintes";
        boolean flag=false;

    if(s.length()!=s1.length())
    {
        System.out.println("Strings are not equal");
        for(int i=0;i<s.length();i++)
        {
            if ((int)s.charAt(i)<(int)s1.charAt(i))
            {
                System.out.println("Smaller String is "+s);
                break;
            }
            else
            {
                    System.out.println("Greater String is "+s);
                    break;
            }
        }
    }
        else if(s.length()==s1.length())
        {
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)==s1.charAt(i))
                {
                   flag=true;
                }
                else if((int)s.charAt(i)<(int)s1.charAt(i)){
                    flag=false;
                    System.out.println("Smaller String is "+s);
                    break;
                }
                else {
                    flag=false;
                    System.out.println("Greater String is "+s);
                    break;
                }
            }
        }

        if(flag)
        {
            System.out.println("Strings are equal");
        }
    }
}
