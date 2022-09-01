package BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SugarDelivery_2839 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 배달해야 할 무게
		int count3 = 0;
		int sum = -1;

		while (true) {
			if (n % 5 == 0) {
				sum = (n / 5) + count3;
				System.out.println(sum);
				break;
			} else if (n < 0) {
				System.out.println(-1);
				break;
			}
			n -= 3;
			count3++;

		}
	}

}
/*
 * 어려웠던 부분: n이 3의 배수일 떄 n을 3으로 나눈 몫이 아니라 3을 뺀 횟수를 카운트한다.
 * 문제 해결: 5의 배수가 될 때까지 전체 무게에서 3을 하나씩 빼면 될것같다
 */
