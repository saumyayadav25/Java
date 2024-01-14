import java.util.*;
public class Loops{
  public static void main(String args[]){
    //WHILE LOOP
    //print "Hello World" 5 times
    int counter = 0;
    while (counter<5){
      System.out.println('Hello World');
      counter++;
    }
    //print number from 1 to n
    Scanner sc= new Scanner(System.in);
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
    
  }
}
