package durgasoft;

public class ReferenceOverloading {
    public static void main(String[] args) {
        ReferenceOverloading obj1= new ReferenceOverloading();

        Animal animal= new Animal();
        obj1.methodOne(animal);

        Monkey monkey = new Monkey();
        obj1.methodOne(monkey);

        Animal animal1= new Monkey();
        obj1.methodOne(animal1);
    }
    public void methodOne(Animal animal) {
        System.out.println("Animal method");
    }
    public void methodOne(Monkey monkey) {
        System.out.println("Monkey method");
    }
}
class Animal
{
}
class Monkey extends Animal
{
}
