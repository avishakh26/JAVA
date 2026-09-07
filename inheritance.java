public class inheritance{

    static class animal{
        void eat(){
            System.out.println("Kuttay khay");
        }
    }

    static class dog extends animal{

        void daka(){
            System.out.println("Kuttay dake o");

        }

    }

    static class biral extends dog{
        void nache(){
            System.out.println("ei shalay nache o");
        }
    }



    public static void main(String[] args){

        biral d = new biral();

        d.eat();
        d.daka();
        d.nache();

    }

}