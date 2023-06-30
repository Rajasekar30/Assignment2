package week1.assignment2;

import java.util.Arrays;

public class FindFirstMissingElement {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
	
		Arrays.sort(arr);
		
		int cnt = 0;
		for (int i = 1; i < arr.length; i++) {
			
			if (i == arr[cnt]) {
				cnt++;
			}
			else {
				System.out.println("Missing Element:"+i);
			}

		}
	}

}
