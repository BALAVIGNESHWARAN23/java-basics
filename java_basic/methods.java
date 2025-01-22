import java.util.*;
public class methods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String valiedname = input.nextLine();
                if (valiedname == "bala"){
                    collection("bala","9025302745","23/09/2004","no1 mariyappa reddy st manavalanagar thiruvallur -602002");
                }
                else{
                    System.out.println("name is not found");
                }
                    
                
       
    }
    public static void  collection(String name,String PHno,String DOB, String adderss){
                    System.out.println("name :"+ name );
                    System.out.println("PHNO :"+ PHno);
                    System.out.println("DOB :"+ DOB );
                System.out.println("adderss :"+ adderss );

        }
}
