public class SubString{
  public static String subStrings(String str, int si, int ei){
    String substr="";
    for(int i=si;i<ei;i++){
      substr += str.charAt(i);
    }
    return substr;
  }
  public static void main(String args[]){
    String str="Hello World";
   // System.out.println(subStrings(str,0,7));
  //function in java
    System.out.println(str.substring(0,7));
  }
}
