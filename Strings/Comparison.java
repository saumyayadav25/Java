public class Comparison{
  public static void main(String args[]){
    String s1="Tony";
    String s2="Tony";
    String s3= new String("Tony");

    if(s1==s2){
      System.out.println("Strings s1 and s2 are equal");
    } else{
      System.out.println("String s1 and s2 are not equal");
    }
    if(s1==s3){
      System.out.println("Strings s1 and s3 are equal");
    } else{
      System.out.println("String s1 and s3 are not equal");
    }

    if(s1.equals(s3)){ //equal function compares only values in string
      System.out.println("Strings s1 and s3 are equal");
    } else{
      System.out.println("String s1 and s3 are not equal");
    }
  }
}
