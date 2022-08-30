package BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fractions_1193 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 1193
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());

		int cross_count = 1; // 해당 대각선 개수
		int prev_count_sum = 0; // 직전 대각선까지의 블럭 개수 누적합

		while (true) {
			if (x <= prev_count_sum + cross_count) {
				if (cross_count % 2 == 1) {// 대각선의 블럭 개수가 홀수라면
					// 분자가 큰 수부터 시작
					// 분자는 해당 대각선 블럭 개수-(x-직전 대각선까지 블럭 개수 누적합-1)
					// 분모는 x직전 대각선까지의 블력 개수
					System.out.print((cross_count - (x - prev_count_sum - 1)) + "/" + (x - prev_count_sum));
					break;
				} else {// 대각선의 블럭 개수가 짝수라면
					System.out.println((x - prev_count_sum) + "/" + (cross_count - (x - prev_count_sum - 1)));
					break;
				}
			} else {
				prev_count_sum += cross_count;
				cross_count++;
			}

		}

	}

}
