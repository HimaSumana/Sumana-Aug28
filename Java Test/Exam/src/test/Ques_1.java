package test;

public class Ques_1 {
	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5};
		int[] b= new int[a.length];
		
		for(int i=0;i < a.length; i++) {
			b[i]=a[i];
		}
		for(int i: a) {
			System.out.println(i + " ");
		}
	}

}
