
class box{
    double height;
    double width;
    double dept;

}


public class asigningdot{
    public static void main(String[] args){
        box b = new box();

        b.height = 10;
        b.width = 20;
        b.dept = 30;

        double volume = b.height * b.width * b.dept;
        System.out.println("Volume is " +volume);

    }
}