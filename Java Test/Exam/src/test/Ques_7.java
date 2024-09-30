package test;

public class Ques_7 {
	public static void main(String[] args) {
       
        int[] array = {-3,5,-1,7,-8,2,9,-6};

        System.out.println("Positive numbers in the array are:");
        
        for (int num : array) 
        { 
            if (num > 0) 
            {
                System.out.print(num + " ");
            }
        }
    }

}
