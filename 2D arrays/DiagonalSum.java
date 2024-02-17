public class DiagonalSum{
  public static int diagonalS(int matrix[][]){
    int sum=0;
    //unoptimised code(time complexity:O(n^2))
    // for (int i=0; i<matrix.length;i++){
    //   for(int j=0; i<matrix[0].length;j++){
    //     if (i==j){
    //       sum+=matrix[i][j]; //overlapping condition covered
    //     }
    //     else if(i+j==matrix.length-1){
    //       sum+=matrix[i][j];
    //     }
    //   }
    // }

    //time complexity:O(n) for this optimised code.
    for(int i=0; i<matrix.length;i++){
      //pd
      sum+=matrix[i][i];
      //sd
      if(i!=matrix.length-1-i)
        sum+=matrix[i][matrix.length-i-1]; //overlapping cond. not covered
    }
    return sum;
  }
  public static void main(String args[]){
    int matrix[][]={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
    System.out.println(diagonalS(matrix));
  }
}
