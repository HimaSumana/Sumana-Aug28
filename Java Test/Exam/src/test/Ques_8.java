package test;

public class Ques_8 {
	public static void main(String[] args) {
      
        int[] array = {2,4,6,8,10};
        int sum = 0;

        for (int num : array) {
            sum += num;
        }

        double average = (double) sum / array.length;
        System.out.println("The average value of array elements is: " + average);
    }

}
