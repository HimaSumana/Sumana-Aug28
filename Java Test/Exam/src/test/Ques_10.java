package test;

public class Ques_10 {
	public static void main(String[] args) {
        int[] array1 = {1,3,5};
        int[] array2 = {2,4,6};
        
        int[] mergedArray = new int[array1.length + array2.length];
        
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }
       
        for (int i = 0; i < array2.length; i++) {
            mergedArray[array1.length + i] = array2[i];
        }
        System.out.println("Merged array: ");
        for (int i : mergedArray) {
            System.out.print(i + " ");
        }
    }
}