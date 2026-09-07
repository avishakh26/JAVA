public class inhertancetest{

    static class Music{
        void sound(){
            System.out.println("Music has many sounds");
        }
    }


    static class Guitar extends Music{
        void sence(){
            System.out.println("Guitar is one of the senceable things");
        }
 
    }



    public static void main(String[] args){

        Guitar g = new Guitar();

        g.sound();
        g.sence();


    }




}