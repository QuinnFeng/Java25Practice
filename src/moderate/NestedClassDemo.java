package moderate;
public class NestedClassDemo {

    // ========================================
    // 1. Static Nested Class
    // ========================================

    static class StaticNested {

        private String message = "Hello from static nested class";

        public void showMessage() {
            System.out.println(message);
        }
    }


    // ========================================
    // 2. Member Inner Class
    // ========================================

    class MemberInner {

        private String message = "Hello from member inner class";

        public void showMessage() {
            System.out.println(message);
        }
    }


    // ========================================
    // 3. Inner Class Accessing Outer Class
    // ========================================

    private String outerMessage = "Hello from outer class";

    class InnerAccess {

        public void showOuterMessage() {
            System.out.println(outerMessage);
        }
    }


    // ========================================
    // 4. Inner Class Can Access Private Members
    // ========================================

    private int number = 100;

    class PrivateAccess {

        public void changeNumber() {
            number = 200;
        }

        public void showNumber() {
            System.out.println("Number: " + number);
        }
    }


    // ========================================
    // 5. Static Nested Class and Outer Class
    // ========================================

    private static String staticMessage =
            "Static field in outer class";

    static class StaticAccess {

        public void showStaticMessage() {
            System.out.println(staticMessage);
        }
    }


    // ========================================
    // 6. Local Inner Class
    // ========================================

    public void localClassDemo() {

        String localMessage = "Hello from local class";

        class LocalInner {

            public void showMessage() {
                System.out.println(localMessage);
            }
        }

        LocalInner local = new LocalInner();

        local.showMessage();
    }


    // ========================================
    // 7. Anonymous Inner Class
    // ========================================

    interface Greeting {

        void sayHello();
    }


    public void anonymousClassDemo() {

        Greeting greeting = new Greeting() {

            @Override
            public void sayHello() {
                System.out.println(
                        "Hello from anonymous inner class"
                );
            }
        };

        greeting.sayHello();
    }


    // ========================================
    // Main
    // ========================================

    public static void main(String[] args) {

        // ------------------------------------
        // Static nested class
        // ------------------------------------

        StaticNested staticNested =
                new StaticNested();

        staticNested.showMessage();


        // ------------------------------------
        // Member inner class
        // ------------------------------------

        NestedClassDemo outer =
                new NestedClassDemo();

        MemberInner memberInner =
                outer.new MemberInner();

        memberInner.showMessage();


        // ------------------------------------
        // Inner class accessing outer class
        // ------------------------------------

        InnerAccess innerAccess =
                outer.new InnerAccess();

        innerAccess.showOuterMessage();


        // ------------------------------------
        // Inner class accessing private field
        // ------------------------------------

        PrivateAccess privateAccess =
                outer.new PrivateAccess();

        privateAccess.showNumber();

        privateAccess.changeNumber();

        privateAccess.showNumber();


        // ------------------------------------
        // Static nested class accessing
        // static outer field
        // ------------------------------------

        StaticAccess staticAccess =
                new StaticAccess();

        staticAccess.showStaticMessage();


        // ------------------------------------
        // Local inner class
        // ------------------------------------

        outer.localClassDemo();


        // ------------------------------------
        // Anonymous inner class
        // ------------------------------------

        outer.anonymousClassDemo();
    }
}
