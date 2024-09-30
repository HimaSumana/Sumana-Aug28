package test;

import java.util.HashSet;

public class Ques_6 {
	
	public static void main(String[] args) {
		
		int[] array = {1,2,2,3,4,4,5,6,6};
		HashSet<Integer> uniqueElements = new HashSet<>();

		for (int num : array) {
			
		    uniqueElements.add(num);  
		}
		System.out.println("Unique elements in the array are: " + uniqueElements);
	}
}

