package Array;

import java.util.Scanner;

public class charAt_8958 {

	public static void main(String[] args) {
		// 8958
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] arr = new String[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.next();
		}

		// charAt(): String 으로 저장된 문자열에서 한 글자만 선택해 char 타입으로 변환
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			int sum = 0;

			for (int j = 0; j < arr[i].length(); j++) {
				if (arr[i].charAt(j) == 'O') {
					count++;
				} else {
					count = 0;
				}
				sum += count;
			}
			System.out.println(sum);

		}

	}

}
