package oop;

public class FourPillarsDemo {

    public static void main(String[] args) {

        // Create objects
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Mimi");

        // Polymorphism
        Animal animal1 = dog;
        Animal animal2 = cat;

        animal1.makeSound();
        animal2.makeSound();

        // Encapsulation
        dog.setAge(5);
        System.out.println(dog.getName() + " is " + dog.getAge() + " years old.");

        // Inheritance
        dog.eat();
        cat.eat();
    }
}


// Abstraction
abstract class Animal {

    private String name;

    Animal(String name) {
        this.name = name;
    }

    // Encapsulation
    public String getName() {
        return name;
    }

    // Abstract method
    abstract void makeSound();

    // Common method inherited by subclasses
    void eat() {
        System.out.println(name + " is eating.");
    }
}


// Inheritance
class Dog extends Animal {

    private int age;

    Dog(String name) {
        super(name);
    }

    // Polymorphism
    @Override
    void makeSound() {
        System.out.println(getName() + " says: Woof!");
    }

    // Encapsulation
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


// Inheritance
class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    // Polymorphism
    @Override
    void makeSound() {
        System.out.println(getName() + " says: Meow!");
    }
}