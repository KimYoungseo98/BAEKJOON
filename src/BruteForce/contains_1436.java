package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class contains_1436 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int num = 666;
		int count = 1;

		while (count != n) {
			num++;
			if (String.valueOf(num).contains("666")) {
				count++;
			}
		}
		System.out.println(num);

	}

}

/*
 * 어려웠던 부분: 666으로 시작해 1씩 증가하면서 해당 문자열에 666이 있을 경우 count++, n이 count와 같아지면 해당 숫자
 * 출력 문제 해결: contains() 메소드 사용, 해당 문자열 안에 검사하려는 문자열이 포함되어있는지 검사하고 담겨있으면 true반환
 * 
 */
