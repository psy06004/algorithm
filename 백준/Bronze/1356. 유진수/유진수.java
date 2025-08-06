import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		int n = num.length();
		String result = "NO";
		
		//자를 위치 설정
		for (int i = 1; i < n; i++) {
			int mult1 = 1;
			int mult2 = 1;
			
			//나눠서 각각 곱한 후 비교
			for (int j = 0; j < i; j++) {
				mult1 *= num.charAt(j)-'0';
			}
			for (int j = i; j < n; j++) {
				mult2 *= num.charAt(j)-'0';
			}
			
			if(mult1 == mult2) {
				result = "YES";
				break;
			}
		}
		System.out.println(result);
	}
}