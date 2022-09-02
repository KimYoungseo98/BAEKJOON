package BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

class BigInteger_10757 {
	public static void main(String[] args) throws IOException {
		//10757
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		BigInteger a=new BigInteger(st.nextToken());
		BigInteger b=new BigInteger(st.nextToken());
		
		a=a.add(b); //객체와 인자로 들어온 객체를 더한 값을 BigInteger타입으로 반환한다
		System.out.println(a);
		//sysout(a.toString());
	}
}
/*
 * 어려웠던 부분: 큰정수를 입력받는 과정에서 java.lang.NumberFormatException 오류가 생긴다
 * 문제 해결: BigInteger을 사용했다
 */