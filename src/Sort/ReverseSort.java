package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseSort {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(list);
		for (int value : list) {
			sb.append(value).append('\n');
		}
		System.out.println(sb);

	}

}

/*
 * 어려웠던 부분: Collections.sort 를 그냥 쓰면 오류가나고 시간초과된다, 개선된 for문으로 안쓰면 kg받게 틀렸다고함;;
 * 문제 해결: 배열이 아닌 리스트를 StringBuilder에 넣어 해결했다
 * 
 */
