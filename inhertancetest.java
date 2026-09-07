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

    static class Piano extends Guitar{
        void play(){
            System.out.println("It's sounds good too");
        }
    }



    public static void main(String[] args){

        Piano g = new Piano();

        g.sound();
        g.sence();
        g.play();


    }




}