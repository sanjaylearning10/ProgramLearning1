package durgasoft;

public class Overriding {

    public static void main(String[] args) {

        Parent objParent= new Parent();
        objParent.methodOne();

        Child objChild= new Child();
        objChild.methodOne();

        Parent objParentRef= new Child();
        objParentRef.methodOne();

        //Child refernce can't hold parent object Syntax not valid
       // Child objChildRef= new Parent();

    }
}

class Parent
{
    public void methodOne()
    {
        System.out.println("Parent Method Implementation");
    }
}

class Child extends Parent
{
    public void methodOne()
    {
        System.out.println("Child Method Implementation");
    }
}