package BasicMath2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class isPrime_1978 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int count=0;
		br.readLine();
		
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		while(st.hasMoreTokens()) { //Tokenizer에 토큰이 있을때까지
			boolean isPrime=true; //소수일경우 true;
			int num=Integer.parseInt(st.nextToken()); //공백과 함꼐 숫자 입력
			if(num==1) {
				continue;
			}
			for(int i=2; i<num; i++) {
				if(num%i==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				count++;
			}
			
			
		}
		System.out.println(count);
	

	}
}

/*
 * 어려웠던 부분:소수를 어떤방식으로 찾아야 하는지
 * 문제 해결: while 문에 hasMoreTokens()를 이용했다
 * isPrime을 true로 놓고 for문에서 나누어 떨어지는 수가 있다면 false로 바꾸어 true개수를 출력했다
 */
