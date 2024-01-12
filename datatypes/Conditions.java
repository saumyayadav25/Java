import java.util.*;
public class Conditions{
  public static void main(String args[]){
    //if-else conditions
    int age= 22;
    if (age>=18){
      System.out.println("You can vote");
    }
    else{
      System.out.println("You cannot vote");
    }

    //print largest number
    int A=1, B=3, C=6;
    if(A>=B && A>=C){
      System.out.println("A is largest");
    }
    else if (B>=C){
      System.out.println("B is largest");
    }
    else{
      System.out.println("C is largest");
    }
  }
}
