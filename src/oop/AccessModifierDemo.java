package oop;

public class AccessModifierDemo {

    // public: accessible from anywhere
    public String publicField = "Public";

    // private: accessible only inside this class
    private String privateField = "Private";

    // protected: accessible in the same package
    // and by subclasses
    protected String protectedField = "Protected";

    // default: accessible in the same package
    String defaultField = "Default";


    // Public method
    public void publicMethod() {
        System.out.println("Public method");
    }

    // Private method
    private void privateMethod() {
        System.out.println("Private method");
    }

    // Protected method
    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    // Default method
    void defaultMethod() {
        System.out.println("Default method");
    }


    public static void main(String[] args) {

        AccessModifierDemo obj = new AccessModifierDemo();

        // Access the fields
        System.out.println(obj.publicField);
        System.out.println(obj.privateField);
        System.out.println(obj.protectedField);
        System.out.println(obj.defaultField);

        // Call the methods
        obj.publicMethod();
        obj.privateMethod();
        obj.protectedMethod();
        obj.defaultMethod();
    }
}

