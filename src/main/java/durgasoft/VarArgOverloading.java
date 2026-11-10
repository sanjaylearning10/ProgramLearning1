package durgasoft;

public class VarArgOverloading {
    public static void main(String[] args) {
        VarArgOverloading obj1= new VarArgOverloading();
        obj1.methodOne(10);
        obj1.methodOne(10,20,30);
        obj1.methodOne();
    }

    public void methodOne(int i) {
        System.out.println("int method");
    }
    public void methodOne(int...i) {
        System.out.println("Var Args method");
    }
}
