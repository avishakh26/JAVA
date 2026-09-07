class animal{
    void sounds(){
        System.out.println("How animal sounds");
    }
}

class dog extends animal{
    @Override
    void sounds(){
        System.out.println("Dog do gheu");
    }
}



public class override{
    public static void main(String[] args){
        
        dog d = new dog();
        d.sounds();
        

    }
}