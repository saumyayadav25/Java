public class Firstexample{
  public static void main(String args[]){
    Pen p1 = new Pen(); //created a pen object called p1
    p1.setColor("blue");
    System.out.println(p1.color);
    p1.setTip(5);
    System.out.println(p1.tip);
    p1.color="Yellow";
    System.out.println(p1.color);

    BankAccount myAcc=new BankAccount();
    myAcc.username="saumyayadav";
    //myAcc.password="abcd"; //this throws an error that password is not visible
    myAcc.setPassword("abcd");
  }
}

class BankAccount{
  public String username;
  private String password;
  public void setPassword(String pwd){
    password=pwd;
  }
}
class Pen{
  //define properties+functions
  String color;
  int tip;
  void setColor(String newColor){
    color=newColor;
  }
  void setTip(int newTip){
    tip=newTip;
  }
}

class Student{
  String name;
  int age;
  float percentage;
  void calcPercentage(int phy, int chem, int math){
    percentage=(phy+chem+math)/3;
  }
}
