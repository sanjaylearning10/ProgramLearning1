package durgasoft;

public class CoVariantOverriding3 {

    public static void main(String[] args) {

        CoVariantOverridingParent3 objParent= new CoVariantOverridingParent3();
        objParent.methodOne();

        CoVariantOverridingChild3 objChild= new CoVariantOverridingChild3();
        objChild.methodOne();

        CoVariantOverridingParent3 objParentRef= new CoVariantOverridingChild3();
        objParentRef.methodOne();


    }
}

class CoVariantOverridingParent3
{
    public Number methodOne()
    {
        System.out.println("Parent Number Method Implementation");
        return null;
    }
}

class CoVariantOverridingChild3 extends CoVariantOverridingParent3
{
    public Integer methodOne()
    {
        System.out.println("Child Integer Method Implementation");
        return null;
    }


}