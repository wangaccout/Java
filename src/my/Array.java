package my;

import java.util.Arrays;

public class Array {
	// 数组作为函数的参数
	public static void printArray(int[] arrray) {
		for(int i = 0; i < arrray.length; i++) {
			System.out.print(arrray[i] + " ");
		}
		System.out.println("\n");
	}
	
	// 数组作为函数的返回值
	public static int[] reverse(int[] list) {
		int[] result = new int[list.length];
		for(int i = 0, j = result.length - 1; i < list.length; i++, j--) {
			result[j] = list[i];
		}
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println("\n");
		for(int element: result) {
			System.out.println(element);
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		int size = 5;
		double[] myList = new double[size];
		myList[0] = 5.6;
	    myList[1] = 4.5;
	    myList[2] = 3.3;
	    myList[3] = 13.2;
	    myList[4] = 4.0;
		
		System.out.println(myList);
		
		double total = 0;
		for(int i = 0; i < size; i++) {
			total += myList[i];
		}
		System.out.println("总和为：" + total);
		
		double[] myList1 = {1.9, 2.9, 3.4, 6.5};
		
		for(int i = 0; i < myList1.length; i++) {
			System.out.print(myList1[i] + " ");
		}
		
		double max = myList1[0];
		for(int i = 1; i < myList1.length; i++) {
			if(myList1[i] > max) {
				max = myList[i];
			}
		}
		System.out.println("\nmax is " + max);
		
		// for-each循环
		for(double element: myList1) {
			System.out.println(element);
		}
		
		printArray(new int[] {3, 1, 2, 6});
		reverse(new int[] {3, 1, 2, 6});
		
		// 多维数组
		String[][] s = new String[2][];
		s[0] = new String[2];
		s[1] = new String[3];
		s[0][0] = new String("good");
		s[0][1] = new String("luck");
		s[1][0] = new String("to");
		s[1][1] = new String("you");
		s[1][2] = new String("!");
		System.out.println(Arrays.toString(s));
		System.out.println(Arrays.deepToString(s));
		
		for(int i = 0; i < s.length; i++) {
			for(int j = 0; j < s[i].length; j++) {
				System.out.print(s[i][j] + " ");
			}
			
		}
	}

}




















