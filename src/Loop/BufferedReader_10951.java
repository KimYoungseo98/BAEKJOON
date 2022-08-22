package Loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BufferedReader_10951 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 10951 다시보기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s;
		StringTokenizer st;

		while ((s = br.readLine()) != null) {
			st = new StringTokenizer(s, " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append(a + b + "\n");
		}
		System.out.println(sb);

	}

}
