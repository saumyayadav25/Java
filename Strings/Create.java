import java.util.*;
public class Create{
  public static void main(String args[]){
    char arr[]={'a','b','c','d'};
    String str="abcd";
    String str2=new String("xyz");
    //input
    Scanner sc=new Scanner(System.in);
    String name;
    name=sc.nextLine();
    System.out.println(name);
    
    //length function
    System.out.println(name.length());

    //concatenation
    String firstName="Saumya";
    String lastName="Yadav";
    String fullName=firstName+" "+lastName;
    System.out.println(fullName);
  }
}
