import java.util.*;
public class Inp{
  public static void main(String args[]){
    int marks[]= new int[100];
    Scanner sc= new Scanner(System.in);
    marks[0]= sc.nextInt(); //phy
    marks[1]= sc.nextInt(); //chem
    marks[2]= sc.nextInt(); //maths

    System.out.println("phy: " + marks[0]);
    System.out.println("chem: " + marks[1]);
    System.out.println("maths: " + marks[2]);
    marks[2]=marks[2]+1; //update marks
    System.out.println("maths: " + marks[2]);
  }
}
