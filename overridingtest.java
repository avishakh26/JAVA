public class overridingtest{

    static class Khulna{
        void wish(){
            System.out.println("Khulna jaite iccha kore");
        }
    }

    static class Dhaka extends Khulna{
        @Override
        void wish(){
            System.out.println("Khulnay manush jay?");
        }
        
    }


    public static void main(String[] args){

        Dhaka w = new Dhaka();

        w.wish();


    }
}