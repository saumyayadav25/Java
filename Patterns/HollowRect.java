public class HollowRect{
  public static void hollow_rectangle(int totalRows, int totalCols){
    //outer loop
    for (int i=1; i<=totalRows;i++){
      //inner loops
      for(int j=1; j<=totalCols; j++){
        if (i==1 || i==totalRows || j==1 || j==totalCols){
          System.out.print("*");
        } else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
  public static void main(String args[]){
    hollow_rectangle(4,5);
  }
}
