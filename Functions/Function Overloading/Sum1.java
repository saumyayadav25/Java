public class Sum1{
  //function to calculate sum of 2 integer values
  public static int sum( int a , int b){
    return a+b;
  }
  //function to calculate sum of 2 float values
  public static float sum(float a, float b){
    return a+b;
  }
  public static void main(String args[]){
    System.out.println(sum(1,7));
    System.out.println(sum(1.7f , 7.5f));
  }
}
