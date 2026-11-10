package durgasoft;

public class MethodSignatureOverloading {
    public static void main(String[] args) {

        MethodSignatureOverloading obj1= new MethodSignatureOverloading();
        obj1.method1();
        obj1.method1(2);
        obj1.method1(10.5);
        //obj1.method2(10,120.45);
    }

    public void method1()
    {
        System.out.println("No Arg Method");
    }
    public void method1(int i)
    {
        System.out.println("integer Arg Method");
    }
    public void method1(double f)
    {
        System.out.println("double Arg Method");
    }
}
