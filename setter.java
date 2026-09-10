

class person{
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }


    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }



    void display(){
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
    }


}


public class setter{
    public static void main(String[] args){
        person p1 = new person();


        p1.setName("Avishakh");
        p1.setAge(23);

        p1.display();

    }
}