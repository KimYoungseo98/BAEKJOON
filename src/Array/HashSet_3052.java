package Array;

import java.util.HashSet;
import java.util.Scanner;

public class HashSet_3052 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//int[] arr=new int[10];
		//int temp=0;
		//int count=0;
		 //HashSet
		 //중복되는 원소를넣을 경우 하나만 저장한다, 순서 개념이 없어 sort메소드를 사용할 수 없다. 리스트로 변환 후 정렬해야 한다
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0; i<10; i++) {
			hs.add(scanner.nextInt()%42);
		}
		System.out.println(hs.size());
		
		
		
		
		
//		for(int i=0; i<10; i++) {
//			arr[i]=scanner.nextInt()%42;
//		}
//		for(int i=0; i<10; i++) {
//			temp=0;
//			for(int k=i+1; k<10; k++) {
//				if(arr[i]==arr[k]) temp++;
//			}
//			if (temp==0) count++;
//		}
//		System.out.println(count);
		

	}

}
