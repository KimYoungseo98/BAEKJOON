package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BlackJack_2798 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken()); // 카드의 개수
		int m = Integer.parseInt(st.nextToken()); // 숫자
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int result = search(arr, n, m);
		System.out.println(result);

	}

	static int search(int[] arr, int n, int m) { // 세 카드의 합의 모든 경우의 수를 조회
		int result = 0;

		for (int i = 0; i < n - 2; i++) { // 3개를 고르기 때문에 첫번째 카드는 n-2까지만 순회
			for (int j = i + 1; j < n - 1; j++) {// 그 다음 카드부터 n-1까지
				for (int k = j + 1; k < n; k++) {// 그 다음 카드부터 n까지

					int temp = arr[i] + arr[j] + arr[k];
					if (m == temp) { //세 수의 합이 m과 같다면 종료
						return temp;
					}
					if (result < temp && temp < m) { //m애 최대한 가까운 세 수의 합 구하기
						result = temp;
					}

				}
			}

		}

		return result;
	}

}
