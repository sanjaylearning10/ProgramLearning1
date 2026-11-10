package durgasoft;

public class CoVariantOverriding {

    public static void main(String[] args) {

        CoVariantOverridingParent objParent= new CoVariantOverridingParent();
        objParent.methodOne();

        CoVariantOverridingChild objChild= new CoVariantOverridingChild();
        objChild.methodOne();

        CoVariantOverridingParent objParentRef= new CoVariantOverridingChild();
        objParentRef.methodOne();

        //Child refernce can't hold parent object Syntax not valid
       // Child objChildRef= new Parent();

    }
}

class CoVariantOverridingParent
{
    public Object  methodOne()
    {
        System.out.println("Parent Object Method Implementation");
        return null;
    }
}

class CoVariantOverridingChild extends CoVariantOverridingParent
{
    public String methodOne()
    {
        System.out.println("Child String Method Implementation");
        return null;
    }


}