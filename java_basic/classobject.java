import java.util.*;
public class classobject {
    String name;
    String PHNO;
    String addresss;

    public void display(){
        System.out.println("name is :"+name);
        System.out.println("Phno is :"+PHNO);
        System.out.println("Address is :"+addresss);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("name is :");
        String input_name = input.nextLine();


       classobject obj = new classobject();
       obj.name=input.nextLine();
       System.out.println("Phno is :");
       obj.PHNO=input.nextLine();
       System.out.println("Address is :");
       obj.addresss=input.nextLine();
       obj.display();
    }
    
}
