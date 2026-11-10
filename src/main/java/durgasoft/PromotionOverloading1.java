package durgasoft;

public class PromotionOverloading1 {
    public static void main(String[] args) {

       // byte->short->int->long->float->double
        //char->int->long->float->double
        PromotionOverloading1 obj1= new PromotionOverloading1();
        obj1.methodOne(10,10.5f);
        obj1.methodOne(101.5f,10);
        //Ambiguous method call. Both methodOne
        //(int,float)
        //(float,int)

        //obj1.methodOne(10,10);

        //obj1.methodOne(10.5f,10.3f);

    }

    public void methodOne(int i, float f) {
        System.out.println("int-float method");
    }
    public void methodOne(float f, int i) {
        System.out.println("float-int method");
    }

}
