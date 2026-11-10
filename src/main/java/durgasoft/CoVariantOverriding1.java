package durgasoft;

public class CoVariantOverriding1 {

    public static void main(String[] args) {

        CoVariantOverridingParent1 objParent= new CoVariantOverridingParent1();
        objParent.methodOne();

        CoVariantOverridingChild1 objChild= new CoVariantOverridingChild1();
        objChild.methodOne();

        CoVariantOverridingParent1 objParentRef= new CoVariantOverridingChild1();
        objParentRef.methodOne();


    }
}

class CoVariantOverridingParent1
{
    public Object  methodOne()
    {
        System.out.println("Parent Object Method Implementation");
        return null;
    }
}

class CoVariantOverridingChild1 extends CoVariantOverridingParent1
{
    public StringBuffer methodOne()
    {
        System.out.println("Child StringBuffer Method Implementation");
        return null;
    }


}