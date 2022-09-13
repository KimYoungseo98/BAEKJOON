package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Cutline_25305 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr=new int[n];
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0; i<n; i++) {
			
			arr[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		System.out.println(arr[n-k]);


	}

}

/*
 * 어려웠던 부분: stringtokenizer로 배열 입력받기
 * 문제 해결:
 * 
 */