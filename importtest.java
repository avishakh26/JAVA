import java.util.*;

public class importtest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        float cg = sc.nextFloat();

        System.out.println("His name is "+name);
        System.out.println("He is "+age+" years old");
        System.out.println("His cgpa is "+cg);

    }
}