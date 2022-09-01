package BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class APT_2775 {
	public static int[][] apt = new int[15][15];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		make_apt();
		int t = Integer.parseInt(br.readLine()); // 테스트 케이스
		// 입력받을 층과 호:1<=k,n<=14 0층부터 시작

		for (int i = 0; i < t; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			sb.append(apt[k][n]).append('\n');
		}
		System.out.println(sb);

	}

	public static void make_apt() {

		for (int i = 0; i < 15; i++) {
			apt[i][1] = 1;
			apt[0][i] = i; // 0층과 1호는 모두 초기화시켜놓기
		}

		for (int i = 1; i < 15; i++) {// 1층부터 14층까지

			for (int j = 2; j < 15; j++) {// 2호부터 14호까지
				apt[i][j] = apt[i - 1][j] + apt[i][j - 1]; // 0층과 1호에 값이 들어있으니까 쌉가넝
			}

		}

	}

}
/*
 * 0층과 1호는 모두 초기화시키는거랑 직전호와 아래층의 합을 채우는것까진생각했다 
 * 근데 2차원배열을 만들어서 입력받을 생각을 못했다
 */

