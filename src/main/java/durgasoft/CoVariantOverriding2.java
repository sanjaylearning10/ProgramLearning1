package durgasoft;

public class CoVariantOverriding2 {

    public static void main(String[] args) {

        CoVariantOverridingParent2 objParent= new CoVariantOverridingParent2();
        objParent.methodOne();

        CoVariantOverridingChild2 objChild= new CoVariantOverridingChild2();
        objChild.methodOne();

        CoVariantOverridingParent2 objParentRef= new CoVariantOverridingChild2();
        objParentRef.methodOne();


    }
}

class CoVariantOverridingParent2
{
    public Object  methodOne()
    {
        System.out.println("Parent Object Method Implementation");
        return null;
    }
}

class CoVariantOverridingChild2 extends CoVariantOverridingParent2
{
    public StringBuilder methodOne()
    {
        System.out.println("Child StringBuilder Method Implementation");
        return null;
    }


}