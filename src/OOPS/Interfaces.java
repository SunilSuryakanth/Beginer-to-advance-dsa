package OOPS;
interface Animal1 {
    int eyes = 2; //Static and Final
    void walk();
}

interface Herbivore {

}
class Dog implements Animal1, Herbivore { //multiple inheritance
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.walk();
        System.out.println(dog.eyes);
    }
}
