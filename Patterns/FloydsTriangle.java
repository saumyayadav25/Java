public class FloydsTriangle{
  public static void floyds_triangle(int n){
    //outer
    int counter=1;
    for (int i=1; i<=n; i++){
      //inner loop
      for(int j=1; j<=i; j++){
        System.out.print(counter + " ");
        counter++;
      }
      System.out.println();
    }
  }
  public static void main(String arg[]){
    floyds_triangle(5);
  }
}
