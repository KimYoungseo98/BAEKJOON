package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sortnum3_10989 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		for (int value : arr) {
			sb.append(value).append('\n');
		}
		System.out.println(sb);

	}

}

/*
 * 어려웠던 부분: 그냥 배열을 출력하면 시간초과
 *  문제 해결: 배열을 StringBuilder에 넣어 해결했다
 * 
 */
