import java.util.*;
public class Loops{
  public static void main(String args[]){
    //WHILE LOOP
    //print "Hello World" 5 times
    int counter = 0;
    while (counter<5){
      System.out.println("Hello World");
      counter++;
    }
    
    //print number from 1 to n
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the value of n ")
    int range= sc.nextInt();
    int c=1;
    while (c<= range){
      System.out.println(c);
      c++;
    }

    //FOR LOOP
    for(int i=1; i<=5; i++){
      System.out.println("Hello World");
    }

    //sum of first n natural numbers
    System.out.println("Enter the value of n ");
    int n=sc.nextInt();
    int sum=0;
    int i=1;
    while(i<=n){
      sum=sum+i;
      i++;
    }
    System.out.println("sum of first n natural numbers is " + sum);
  
  //DO-WHILE LOOP
    int d=1;
    do{
      System.out.println("Hello");
      d++;
    } while (d<=5);
  }
}
