import java.util.*;
public class Reverse{
  public static void main(String args[]){
    //print Reverse of a number
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number you want to reverse ");
    int n=sc.nextInt();
    while(n>0){
      int lastDigit=n%10; // n%10: to get the last digit
      System.out.print(lastDigit);
      n=n/10; // n/10: to remove the last digit
    }
  }
}
