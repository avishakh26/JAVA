class Box {
    double width;
    double height;
    double depth;
}

public class boxDemo{

    public static void main(String[] args){

        Box mybox = new Box();

        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 30;

        double volume = mybox.height * mybox.width * mybox.depth;

        System.out.println("Volume is "+ volume);

    }
}