package function;

import java.util.Scanner;

public class HanSu {
	//1065
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = han(scanner.nextInt());
		System.out.println(num);
	}

	public static int han(int number) {
		int count = 0; // 1~99까지는 하나하나가 모두 한수이기 떄문에
		if (number < 100) {
			return number;
		} else {
			count = 99;
			for (int i = 100; i <= number; i++) {
				int hun = i / 100;
				int ten = (i / 10) % 10;
				int one = i % 10;

				if ((hun - ten) == (ten - one)) {
					count++;
				}
			}

		}

		return count;

	}

}
