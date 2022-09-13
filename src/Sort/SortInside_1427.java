package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class SortInside_1427 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Integer[] arr = new Integer[str.length()];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i) - '0';
		}
		Arrays.sort(arr, Collections.reverseOrder());
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

	}

}

/*
 * 어려웠던 부분: 
 * 문제 해결: collection.reverseOrder을 사용하려면 int가 아닌 Integer사용
 * 
 */