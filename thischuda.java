class Person {
    String name;
    int age;

    Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    void display() {
        System.out.println("My name is " + name);
        System.out.println("Age is " + age);
    }
}

public class thischuda {
    public static void main(String[] args) {

        Person p1 = new Person("Avishakh", 34);

        p1.display();
        
    }
}

