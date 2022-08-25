package String;

import java.util.Scanner;

public class Sum_11720 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		String num=scanner.next(); //숫자를 문자열로 입력받는다
		int sum=0;
		for(int i=0; i<n; i++) {
			sum+=num.charAt(i)-'0'; //문자열의 첫번째 원소부터 누적 합을 구한다
			//charAt()은 해당 문자의 아스키코드 값을 반환하므로 -'0'을 해준다
		}
		System.out.println(sum);

	}

}
