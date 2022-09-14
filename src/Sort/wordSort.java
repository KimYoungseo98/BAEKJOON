package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class wordSort {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String s1, String s2) {
				if (s1.length() == s2.length()) { // 단어의 길이가 같을 경우
					return s1.compareTo(s2); // 사전 순 정렬
				} else {
					return s1.length() - s2.length();
				}
			}
		});
		StringBuilder sb = new StringBuilder();
		sb.append(arr[0]).append('\n');
		for (int i = 1; i < n; i++) {
			if (!arr[i].equals(arr[i - 1])) {
				sb.append(arr[i]).append('\n');
			}
		}
		System.out.println(sb);

	}

}
//Arrays.sort(arr,(String s1, String s2)->s1.length()-s2.length() ); //길이가 짧은것부터 출력

/*
 * 어려웠던 부분: 길이가 같으면 사전순으로, 같은 단어는 한번만 출력 
 * 문제 해결: compareTo()메소드 사용해서 사전순으로 정렬, StringBuilder에 중복되는건 빼고 append해서 출력
 * 
 */
