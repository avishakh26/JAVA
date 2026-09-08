
class shahed{
    void marks(){
        System.out.println("Shahed gives free marks");
    }
}

class anika extends shahed{
    
    void number(){
        System.out.println("Anika does'nt give free marks");
    }
}


public class testday{
    public static void main(String[] args){

        anika a = new anika();

        a.marks();
        a.number();

    }
}