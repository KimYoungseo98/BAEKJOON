package SetAndMap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NumberCard_10815 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine()); // 카드 수
		int[] arr = new int[n];

		st = new StringTokenizer(br.readLine()); // st를 필요할때 만들어주기....??
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr); // 이분탐색할 배열은 정렬되어있어야 함

		int m = Integer.parseInt(br.readLine()); // 구별할 수의 개수
		// int[] arr2 = new int[m];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			int temp = Integer.parseInt(st.nextToken()); // 구별할 수 =search
			// arr2[i]=Integer.parseInt(st.nextToken());
			sb.append(binarySearch(arr, n, temp) + " ");
		}
		bw.write(sb.toString() + "\n");
		bw.flush();
		bw.close();
		br.close();

	}

	public static int binarySearch(int[] arr, int n, int search) {
		int first = 0;
		int last = n - 1;
		int mid = 0;

		while (first <= last) {
			mid = (first + last) / 2;
			if (arr[mid] == search) { // 중간값과 찾으려는 수가 같은 경우
				return 1;
			}
			if (arr[mid] < search) { // 중간값이 찾으려는 수보다 작으면, 그 이하로는 볼 필요 없음
				first = mid + 1;
			} else { // 중간값이 찾으려는 수보다 크면, 그 이상으로는 볼 필요 없음
				last = mid - 1;
			}
		}
		return 0;

	}

}
