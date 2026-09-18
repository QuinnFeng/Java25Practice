package basic;

public class InterfaceDemo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        dog.eat();

        cat.makeSound();
        cat.eat();
    }
}


// Interface
interface Animal {

    void makeSound();

    void eat();
}


// Class implements interface
class Dog implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof!");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }
}


// Another class implements the same interface
class Cat implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow!");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating.");
    }
}