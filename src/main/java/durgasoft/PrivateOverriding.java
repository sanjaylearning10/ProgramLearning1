package durgasoft;

public class PrivateOverriding {

    public static void main(String[] args) {

        PrivateChild objChild= new PrivateChild();
        objChild.methodOne();

        PrivateParent objParent= new PrivateChild();
       //java: methodOne() has private access in durgasoft.PrivateParent
        // objParent.methodOne();
    }
}

class PrivateParent
{
    private void methodOne()
    {
        System.out.println("Parent Private Method Implementation");
    }
}

class PrivateChild extends PrivateParent
{
    public void methodOne()
    {
        System.out.println("Child Method Implementation");
    }
}