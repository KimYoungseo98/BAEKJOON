package function;

public class SelfNumber_4673 {

	public static void main(String[] args) {
		boolean[] check = new boolean[10001];

		for (int i = 0; i < 10001; i++) {
			int n = d(i);
			// n=i(number)를 생성자로 가지는 수=sum
			if (n < 10001) {
				check[n] = true;
			}
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i < 10001; i++) {
			if (!check[i]) {
				sb.append(i + "\n");
			}
		}
		System.out.println(sb);
	}

	public static int d(int number) {
		int sum = number;
		while (number != 0) {
			sum += (number % 10);
			number = number / 10;
		} // number+number의 자리수 합해서 sum으로 리턴
		return sum; // 리턴된 수는 생성자가 있는수

	}

}
