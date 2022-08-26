package String;

import java.util.Scanner;

public class RepeatString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		for (int i = 0; i < num; i++) {
			int n = scanner.nextInt();
			String s = scanner.next();
			// next()는 개행문자를 무시하고 입력받고 nextLine()은 한줄 단위로 입력받음

			for (int j = 0; j < s.length(); j++) {
				for (int k = 0; k < n; k++) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println(" ");
		}

	}

}
