

class calculator{
    int add (int a, int b){
        return a + b;
    }

    int add (int a, int b , int c){
        return a + b + c;
    }

    int add (int a){
        return a;
    }

}
    
        


public class overloading{

    public static void main(String[] args){

        calculator c = new calculator();

        System.out.println (c.add(10,20));
        System.out.println (c.add(10,20,40));
        System.out.println (c.add(20));


    }
}