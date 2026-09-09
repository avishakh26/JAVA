
class calculator{
    int add (int a, int b){
        return  a+b;
    }

    int add (int a , int b , int c){
        return a+b+c;
    }

    int add (int a){
        return a;
    }

}

public class testday{
    public static void main(String[] args){

        calculator c = new calculator();
        System.out.println(c.add(3,5));
        System.out.println(c.add(3,5,7));
        System.out.println(c.add(3));

    }
}

