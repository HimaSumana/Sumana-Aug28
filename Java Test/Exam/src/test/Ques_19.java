package test;

public class Ques_19 {
	public static void main(String[] args) {
        
        String str1 = "kalki";
        String str2 = "bahubali"; 
        String maxString;
        
        if (str1.length() > str2.length()) {
            maxString = str1;
        } else {
            maxString = str2; 
        }
       
        System.out.println("The greater string is: " + maxString);
    }

}