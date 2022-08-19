package Loop;
import java.util.*;
public class PrintStars_2439 {

	public static void main(String[] args) {
		//2439
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		
//		for(int i=0;i<n;i++) {
//			System.out.println("");
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//		} 일반 별찍기
		for(int i=1; i<=n; i++) {
			System.out.println("");
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}//역순으로 찍기
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
		}

	}

}
