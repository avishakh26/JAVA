public class methodoverride{

    static class animal{
        void daka(){
            System.out.println("Daka daki koro ken");
        }
    }

    static class dog extends animal{
        @Override
        void daka(){
            System.out.println("Amar iccha tai");
        }
    }




    public static void main(String[] args){

        dog s = new dog();
        
        s.daka();

    }
}
