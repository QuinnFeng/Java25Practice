package basic;

public class StaticKeywordDemo {

    // Static variable
    static int count;
    
    static
    {	System.out.println("Static block executed.");
    	count = 0;
	}

    // Instance variable
    String name;

    // Constructor
    StaticKeywordDemo(String name) {
        this.name = name;
        count++;
    }

    // Static method
    static void showCount() {
        System.out.println("Objects created: " + count);
    }

    // Instance method
    void introduce() {
        System.out.println("My name is " + name);
    }

    public static void main(String[] args) {

        StaticKeywordDemo person1 = new StaticKeywordDemo("Ken");
        StaticKeywordDemo person2 = new StaticKeywordDemo("Alice");
        StaticKeywordDemo person3 = new StaticKeywordDemo("Bob");

        // Call instance methods
        person1.introduce();
        person2.introduce();
        person3.introduce();

        // Call static method
        StaticKeywordDemo.showCount();

        // Access static variable
        System.out.println("Count: " + StaticKeywordDemo.count);
    }
}
