package basic;

public class CastingDemo {

    static class Animal {

        public void eat() {
            System.out.println("Animal is eating.");
        }
    }

    static class Dog extends Animal {

        public void bark() {
            System.out.println("Dog is barking.");
        }
        
        @Override
        public void eat() {
            System.out.println("Dog is eating.");
        }
    }

    static class Cat extends Animal {

        public void meow() {
            System.out.println("Cat is meowing.");
        }
        
        public void eat() {
            System.out.println("cat is eating.");
        }
    }

    public static void main(String[] args) {

        // ========================================
        // 1. Upcasting
        // ========================================
        // Child object -> Parent reference

        Dog dog = new Dog();

        Animal animal = dog;

        animal.eat();
       

        // animal.bark();
        // Cannot access bark() through Animal reference.


        // ========================================
        // 2. Downcasting
        // ========================================
        // Parent reference -> Child reference

        Dog anotherDog = (Dog) animal;

        anotherDog.eat();
        anotherDog.bark();


        // ========================================
        // 3. Another example of upcasting
        // ========================================

        Animal cat = new Cat();

        cat.eat();


        // ========================================
        // 4. instanceof before downcasting
        // ========================================

        if (animal instanceof Dog) {

            Dog dog2 = (Dog) animal;

            dog2.bark();
        }


        // ========================================
        // 5. Dangerous downcasting
        // ========================================

        Animal animal2 = new Cat();

        // This compiles, but fails at runtime:
        //
        // Dog dog3 = (Dog) animal2;
        //
        // Cat is not a Dog.
        

    }
}