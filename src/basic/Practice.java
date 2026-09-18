package basic;

import java.util.Arrays;

public class Practice {
	
	public static int max(int[] a) {
		int max=Integer.MIN_VALUE;
		for(int x: a) {
			if( x > max ) {
				max=x;
			}
		}
		return max;
		
	}
	
	public static void reverse(int[] a) {
		int i=0;
		while(i<a.length/2) {
			int k=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=k;
			i++;
		}
	}
	
	public static void main(String[] arg) {
		int[] numbers = {4, 7, 2, 9, 1};
		System.out.println(max(numbers));
		reverse(numbers);
		System.out.println(Arrays.toString(numbers));
	}
	
}
