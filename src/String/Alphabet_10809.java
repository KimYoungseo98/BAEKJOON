package String;

import java.util.Scanner;

public class Alphabet_10809 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[26];
		String s = scanner.nextLine();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i); // 문자 추출 후 c에 저장(아스키코드값)
			if (arr[c - 'a'] == -1) { // arr[i]위치에 문자가 담겨있음
				arr[c - 'a'] = i;
			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
