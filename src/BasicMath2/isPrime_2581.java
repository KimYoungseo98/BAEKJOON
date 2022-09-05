package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class isPrime_2581 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int min = n;
		int sum = 0;

		for (int i = m; i <= n; i++) {
			boolean check = true; // 소수 판별
			if (i == 1)
				check = false;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					check = false;
					break;
				}

			}
			if (check) { // check가 true일 때
				if (min > i)
					min = i;
				sum += i;
			}

		}
		if (sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}

	}

}
