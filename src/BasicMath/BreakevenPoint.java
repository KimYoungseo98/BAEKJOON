package BasicMath;

import java.util.Scanner;

public class BreakevenPoint {

	public static void main(String[] args) {
		//1721
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		//int n=a/(c-b)+1; 런타임에러 (c-b)가 0이 될 경우
		
			if(c<=b) {
				System.out.println("-1");
			}else {
				System.out.println((a/(c-b))+1);
			}

	}

}
