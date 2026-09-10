class Person {
    String name;
    int age;
    String hair;

    Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    Person(String n , int a , String h){
        this.name = n;
        this.age = a;
        this.hair = h;

    }

    void display() {
        System.out.println("My name is " + name);
        System.out.println("Age is " + age);
        System.out.println("Hair color is "+ hair);
    }
}

public class thischuda {
    public static void main(String[] args) {

        Person p1 = new Person("Avishakh", 34);
        Person p2 = new Person("Rahim", 65 , "No hair");

        p1.display();
        p2.display();
        
    }
}

