package durgasoft;

public class ClassHierarchyOverloading {
    public void methodOne(String s) {
        System.out.println("String version");
    }
    public void methodOne(Object o) {
        System.out.println("Object version");
    }

    public static void main(String[] args) {
        ClassHierarchyOverloading obj1= new ClassHierarchyOverloading();
        obj1.methodOne("kanishk");
        obj1.methodOne(new ClassHierarchyOverloading());
        obj1.methodOne(null);
    }
}
