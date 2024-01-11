import java.util.*;
public class Operators{
  public static void main(String args[]){
    //ARITHMETIC OPERATORS
    //binary operators: + , - , * , / , %
    int A=10;
    int B=5;
    System.out.println("BINARY OPERATIONS:");
    System.out.println("add=" + (A+B));
    System.out.println("sub=" + (A-B));
    System.out.println("mul=" + (A*B));
    System.out.println("division=" + (A/B));
    System.out.println("remainder=" + (A%B));

    //unary operators: a++,++a, a--, --a.
    int c=10;
    int d= ++c;
    System.out.println("UNARY OPERATIONS:");
    System.out.println(c);
    System.out.println(d);

    int a=10;
    int b=a++;
    System.out.println(a);
    System.out.println(b);

    //RElATIONAL OPERATORS: == , != , < , > , >= , <= 
    int e=10;
    int f=5;
    System.out.println("RELATIONAL OPERATIONS:");
    System.out.println(e==f);
    System.out.println(e!=f);
    System.out.println(e>f);
    System.out.println(e<f);

    //ASSIGNMENT OPERATORS: = , += , -= , *= , /=
    int g=20;
    g+=10;
    System.out.println("ASSIGNMENT OPERATION:");
    System.out.println(g);

    //LOGICAL OPERATORS: && , || , !
    System.out.println("LOGICAL OPERATIONS:");
    System.out.println((3>2) && (5>0));
    System.out.println((3<2) || (5>0));
    System.out.println(!(3==2));
  }
}
