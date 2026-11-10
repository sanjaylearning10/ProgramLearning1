package durgasoft;

public class PromotionOverloading {
    public static void main(String[] args) {

       // byte->short->int->long->float->double
        //char->int->long->float->double
        PromotionOverloading obj1= new PromotionOverloading();
        obj1.methodOne('a'); //char promoted to int
        obj1.methodOne(101);
        obj1.methodOne(10.5f); // float promoted to double.
       //double can't be promoted to float so getting error in below

        // obj1.methodOne(10.5);
    }

    public void methodOne(int i) {
        System.out.println("int-arg method");
    }
    public void methodOne(float f) {
    System.out.println("float-arg method");
    }

}
