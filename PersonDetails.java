class Person {
    String name;
    int age;
    String address;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void display() {
        System.out.println("Name: " + name);
        if (age != 0) System.out.println("Age: " + age);
        if (address != null) System.out.println("Address: " + address);
        System.out.println();
    }
}

public class PersonDetails {
    public static void main(String[] args) {
        Person person1 = new Person("Victor");
        Person person2 = new Person("Joe", 23);
        Person person3 = new Person("Rufus", 23, "123 Street, XYZ City");
        person1.display();
        person2.display();
        person3.display();
    }
}
