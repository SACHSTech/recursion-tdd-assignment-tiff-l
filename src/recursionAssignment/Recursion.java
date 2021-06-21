package recursionAssignment;

public class Recursion{

  public static int countHi(String str){
    // Base case
    if(str.length() < 2) {
      return 0; 
    // Recursive step - "hi"
    } else if (str.substring(0,2).equals("hi")){
      return 1 + countHi(str.substring(2));
    //Recursive step - no "hi"
    }else{
      return countHi(str.substring(1));
    }

  }

  public static String changePi(String str){
    //Base Case
    if(str.length() < 2){
      return str; 
    } 
    //Recursive step: "pi"
    if (str.substring(0,2).equals("pi")){
      return "3.14" + changePi(str.substring(2));
    }
    //Recursive step: no "pi"
    return str.charAt(0) + changePi(str.substring(1));

  }


  public static String stringClean(String str){
    //Base case
    if(str.equals("")){
      return ""; 
    //Recursive step: 1 letter
    } else if(str.substring(1).equals("")){
      return str.substring(0,1) + stringClean(str.substring(1));
    // Recursive step: first and second character are the same. 
    } else if(str.substring(0,1).equals(str.substring(1,2))){
      return stringClean(str.substring(1));
    // Recursive step: first and second character are different
    } else{
      return str.substring(0,1)+ stringClean(str.substring(1)); 
    }

  }


}