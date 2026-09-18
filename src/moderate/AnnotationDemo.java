package moderate;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

public class AnnotationDemo {

    // Built-in annotation
    @Override
    public String toString() {
        return "Annotation Demo";
    }

    // Another common built-in annotation
    @Deprecated
    public void oldMethod() {
        System.out.println("This method is deprecated.");
    }

    // Suppress compiler warning
    @SuppressWarnings("unchecked")
    public void warningExample() {
        java.util.List list = new java.util.ArrayList();
        list.add("Hello");

        System.out.println(list);
    }

    // Custom annotation
    @MyAnnotation(
        author = "Ken",
        version = 1
    )
    public void myMethod() {
        System.out.println("My method");
    }

    public static void main(String[] args) {

        AnnotationDemo demo = new AnnotationDemo();

        demo.myMethod();

        // Reading the custom annotation using reflection
        MyAnnotation annotation = null;
		try {
			annotation = demo.getClass()
			    .getMethod("myMethod")
			    .getAnnotation(MyAnnotation.class);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        System.out.println("Author: " + annotation.author());
        System.out.println("Version: " + annotation.version());
    }
}


// Custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {

    String author();

    int version();
}