package test;

import org.junit.Test;

public class TestTreeset {

	@Test
	public void test() {
		int k = 3;
		int[] arr = new int[] { 4, 6, 1, 8, 0, 2 };
		int result = arr[0];
		for (int i = 0; i < arr.length; i++) {
			result = arr[i];
			int cnt = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (result > arr[j]) {
					cnt++;
					if (cnt > k) {
						break;
					}
				}
			}
		}
		System.out.println(result);
	}

}
