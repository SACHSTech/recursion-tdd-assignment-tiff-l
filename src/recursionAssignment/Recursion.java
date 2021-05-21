package recursionAssignment;

public class Recursion{

  public static int countHi(String str){
    
    if(str.equals("")) {
      return 0; 
    } else if (str.substring(0,1).equals("h")&& str.substring(1,2).equals("i")){
      return 1 + countHi(str.substring(2));
    }else{
      return countHi(str.substring(1));
    }

  }

  public static String changePi(String str){

    if(str.length() < 2){
      return str; 
    } 

    if(str.substring(0,2).equals("pi")){
      return "3.14" + changePi(str.substring(2));
    }

    return str.charAt(0) + changePi(str.substring(1));

  }


}
