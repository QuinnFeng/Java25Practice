package oop;

public class Person {

    // =========================
    // Fields
    // =========================

    // Fields store data that belongs to an object
    String name;
    int age;


    // =========================
    // Constructor
    // =========================

    // Constructor is called when we create a new Person object
    // It has the same name as the class and no return type
    public Person(String name, int age) {

        // "this.name" refers to the object's field
        // "name" refers to the constructor parameter
        this.name = name;
        this.age = age;
    }


    // =========================
    // Methods
    // =========================

    // A method defines something an object can do
    public void introduce() {
        System.out.println("My name is " + name);
    }
    
    public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	// This method changes the object's age
    public void birthday() {
        age++;
    }

    // =========================
    // Main method
    // =========================

    public static void main(String[] args) {

        // Create a Person object using the constructor
        Person person = new Person("Ken", 29);

        // Access the object's fields
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);

        // Call the object's method
        person.introduce();

        // Call birthday(), which increases age by 1
        person.birthday();

        // Print the updated age
        System.out.println("Age after birthday: " + person.age);
    }
}
