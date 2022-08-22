package Array;

import java.util.Scanner;

public class MaxScore_1546 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 1546
		double arr[] = new double[scanner.nextInt()];
		double max = 0;
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
			if (arr[i] > max) {
				max = arr[i];
				// Arrays.sort(arr);
			}
		}
		// System.out.println(max);
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i] / max * 100;
		}
		System.out.println(sum / arr.length);

	}

}
