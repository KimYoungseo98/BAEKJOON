package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class decomposition_2231 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		int m=0;
//		String str_n=br.readLine();
//		int n_length=str_n.length();
//		int n=Integer.parseInt(str_n);
		
		for(int i=0; i<n; i++) { //for(int i=(n-(n_length*9)); i<n; i++)
			int number=i;
			int sum=0;
			while (number!=0) {
				sum+=number%10;
				number/=10;
				
			}
			if(sum+i==n) {
				m=i;
				break;
			}
		}
		System.out.println(m);

	}

}
/*
 * 어려웠던 부분: 가장 작은 생성자가 나오는 분해합
 * 문제 해결: 0부터 입력받은 수까지 각 자리수의 합과 그 수의 합이 입력받은 수와 같으면 리턴한다
 * 
 */
