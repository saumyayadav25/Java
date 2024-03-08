public class Const{
  public static void main(String args[]){
    Student s1= new Student("Saumya");  
    System.out.println(s1.name);
  }
}
class Student{
  String name;
  int roll;
  Student(String name){ //constructor
   // System.out.println("constructor is called...");
    this.name=name;
  }
}
