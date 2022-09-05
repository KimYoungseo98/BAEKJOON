package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Fibonacci_10870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n + 1];
		System.out.println(fi(n));

	}

	static int fi(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return fi(n - 1) + fi(n - 2);
	}
}
/*
 * 어려웠던 부분:런타임 에러
 * 문제 해결:재귀함수 사용
 * 
 */