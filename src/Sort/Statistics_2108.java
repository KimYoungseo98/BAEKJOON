package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Statistics_2108 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		double sum = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		Arrays.sort(arr);

		boolean flag = false;
		int mode_max = 0;
		int mode = 10000;

		for (int i = 0; i < n; i++) {
			int jump = 0; // 동일한 수가 나온만큼 i 값 jump시킬 변수
			int count = 1;
			int i_value = arr[i];

			for (int j = i + 1; j < n; j++) {
				if (i_value != arr[j]) {
					break;
				}
				count++; // i값의 빈도수를 누적
				jump++;
			}
			if (count > mode_max) {
				mode_max = count;
				mode = i_value;
				flag = true; // 이전의 최빈값보다 현재 최빈값이 더 클 경우
			} else if (count == mode_max && flag == true) {
				mode = i_value;
				flag = false;
			}
			i += jump;
		}
		System.out.println(Math.round(sum / n)); // 1.산술평균
		System.out.println(arr[arr.length / 2]); // 2.중앙값
		System.out.println(mode);// 3.최빈값
		System.out.println(arr[n - 1] - arr[0]);// 4.범위

	}

}

/*
 * 어려웠던 부분: 최빈값 구하기 
 * 문제 해결:
 * 
 */
