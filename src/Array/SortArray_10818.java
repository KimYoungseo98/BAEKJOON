package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray_10818 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] array = new int[scanner.nextInt()];
		int max = 0;
		int min = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		Arrays.sort(array);
		System.out.print(array[0] + " " + array[array.length - 1]);

	}

}
