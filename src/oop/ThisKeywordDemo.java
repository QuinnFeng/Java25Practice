package oop;

public class ThisKeywordDemo {

    // Fields
    String name;
    int age;

    // Constructor
    public ThisKeywordDemo(String name, int age) {

        // "this.name" refers to the object's field
        // "name" refers to the constructor parameter
        this.name = name;

        // "this.age" refers to the object's field
        this.age = age;
    }

    // Method
    public void displayInfo() {

        // "this" refers to the current object
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {

        // Create two objects
        ThisKeywordDemo person1 =
                new ThisKeywordDemo("Ken", 29);

        ThisKeywordDemo person2 =
                new ThisKeywordDemo("Alex", 25);

        // Call the method
        person1.displayInfo();

        System.out.println();

        person2.displayInfo();
    }
}
