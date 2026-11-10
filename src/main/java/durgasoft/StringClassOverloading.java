package durgasoft;

public class StringClassOverloading {
    public void methodOne(String s) {
        System.out.println("String version");
    }
    public void methodOne(StringBuffer sb) {
        System.out.println("String Bufffer version");
    }
    public static void main(String[] args) {
        StringClassOverloading obj1= new StringClassOverloading();
        obj1.methodOne("kanishk");
        obj1.methodOne(new StringBuffer("dhanu"));

        //ambiguity error in below
        // obj1.methodOne(null);
    }
}
