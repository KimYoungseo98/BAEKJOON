package BruteForce;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Bulk_7568{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		String[] sp;

		for (int i = 0; i < n; i++) {
			sp = br.readLine().split(" "); // 문자열을 구분자를 기준으로 잘라서 배열에 저장하여 리턴
			arr[i][0] = Integer.parseInt(sp[0]); // 몸무게
			arr[i][1] = Integer.parseInt(sp[1]); // 키
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			int rank = 1;
			for (int j = 0; j < n; j++) {
				if (i == j)
					continue;
				if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					rank++;
				}
			}
			sb.append(rank).append(' ');
		}
		System.out.println(sb);

	}

}

/*
 * 어려웠던 부분: 이차원 배열 나눠서 입력받기
 * 문제 해결: split()함수와 stingbuilder()을 사용했다
 * 
 */
