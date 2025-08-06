import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			long S = sc.nextLong();
			String result = "NO";
			int num = 1; //소인수
			while(true) { //소인수 있으면 루프탈출, 없으면 결과 바꾸고 탈출
				num++; //2부터 카운트 시작
				if(S%num == 0) {
					break;
				}
				if(num > 1000000) {
					result = "YES";
					break;
				}
			}
			System.out.println(result);
		}
	}
}