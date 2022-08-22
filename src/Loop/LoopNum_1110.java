package Loop;

import java.util.Scanner;

public class LoopNum_1110 {

	public static void main(String[] args) {
		// 1110
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		scanner.close();
		int count = 0;
		int copy = a;

		while (true) {

			a = ((a % 10) * 10) + ((a / 10 + a % 10) % 10);
			count++;
			if (copy == a)
				break;

		}
		System.out.println(count);

	}

}
