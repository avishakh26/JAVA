public class inheritance{

    public class animal{
        void eat(){
            System.out.println("Kuttay khay");
        }
    }

    public class dog extends animal{

        void daka(){
            System.out.println("Kuttay dake o");

        }

    }



    public static void main(String[] args){

        dog d = new dog();

        d.eat();
        d.dake();

    }

}