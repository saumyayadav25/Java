import java.util.*;
public class input{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    //String input = sc.next(); //storing the input. It is used for only a single string word
    //System.out.println(input); 
    String name = sc.nextLine(); //it is used for storing two or more words
    System.out.println(name);
    //FOR INTGER INPUT
    int number=sc.nextInt();
    System.out.println(number);
  }
}
