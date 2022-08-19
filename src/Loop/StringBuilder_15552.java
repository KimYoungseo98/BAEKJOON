package Loop;

import java.util.Scanner;

public class StringBuilder_15552 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int a = 0;
		int b = 0;
		int count = scanner.nextInt();

		for (int i = 0; i < count; i++) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			sb.append(a + b + "\n");

		}
		System.out.println(sb);

	}

}
