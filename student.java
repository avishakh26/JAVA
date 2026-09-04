public class student{

    String name;
    int age ;
    double cg;


    void study(){

        System.out.println("My name is "+name);
        System.out.println("I am "+age+"years old");
        System.out.println("My cgpa is"+cg);

    }


    public static void main(String[] args){

        student s1 = new student();
        s1.name = "Magi";
        s1.age = 23;
        s1.cg = 3.34;
        
        s1.study();

    }

}