package basic;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class EqualsHashCodeDemo {

    public static void main(String[] args) {

        Person person1 = new Person("Ken", 29);
        Person person2 = new Person("Ken", 29);
        Person person3 = new Person("John", 30);

        // == compares object references
        System.out.println(person1 == person2); // false

        // equals() compares logical equality
        System.out.println(person1.equals(person2)); // true
        System.out.println(person1.equals(person3)); // false

        // hashCode()
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

        // HashSet uses equals() and hashCode()
        Set<Person> people = new HashSet<>();

        people.add(person1);
        people.add(person2);
        people.add(person3);

        System.out.println(people.size()); // 2
    }
}


class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Person other = (Person) obj;

        return age == other.age
                && Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }
}