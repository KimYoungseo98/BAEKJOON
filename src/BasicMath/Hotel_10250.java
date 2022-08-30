package BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hotel_10250 {

	public static void main(String[] args) throws IOException {
		//10250
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());// 케이스 수
		StringBuilder sb = new StringBuilder();

		int y = 0; // n을 h로 나눈 나머지가 손님의 층 수
		int x = 0; // n을 h로 나눈 몫+1이 엘베로부터 떨어진 거리
		for (int i = 0; i < t; i++) {
//			int h = Integer.parseInt(br.readLine());// 층수
//			int w = Integer.parseInt(br.readLine());// 방수
//			int n = Integer.parseInt(br.readLine());// 몇번째 손님
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());

			if (n % h != 0) {
				y = (n % h) * 100;
				x = (n / h) + 1;
			} else {
				y = h * 100;
				x = n / h;

			}

		}
		sb.append(y + x);
		System.out.println(sb);

	}

}
