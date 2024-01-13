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

    //ternary operators
    int number = 4;
    String type = (number%2==0)? "even" : "odd" ;
    System.out.println(type);

    //switch-case statements
    int num=2;
    switch(number){
      case 1: System.out.println("Hello");
        break;
      case 2: System.out.println("Number is two");
        break;
      default : System.out.println("Good evening");
    }
  }
}
