package OOPS;
abstract  class Animal {
    abstract void walk();
    Animal() {
        System.out.println("Youa are creating a new Animal");
    }
    public void eat() {
        System.out.println("Animal eats");
    }
}
class Horse extends Animal {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal {
    Chicken() {
        System.out.println("Hello chicken");
    }
    public void walk() {

        System.out.println("Walks on 2 legs");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Chicken chicken = new Chicken();
//        chicken.walk();
//        chicken.eat();
    }
}
