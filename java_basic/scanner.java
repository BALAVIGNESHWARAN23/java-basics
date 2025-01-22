import java.util.*;

public class scanner{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a age :");
        int age = input.nextInt();
        System.out.println("enter a name :");
        input.nextLine();
        String name = input.nextLine();
        System.out.println("enter a char :");
        char fl = input.next().charAt(0);
        System.out.println("age is :"+ age);
        System.out.println("name is :"+ name);
        System.out.println("char of fl is :"+fl);
    }

    public string nextLine() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nextLine'");
    }
}