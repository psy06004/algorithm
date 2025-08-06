import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		int result = 0; //결과값
		
		while(true) { //결과값을 1부터 비교해가면서 3개 이상의 수의 배수일 때 루프 탈출
			int count = 0;
			result++;
			for (int i = 0; i < num.length; i++) {
				if(result % num[i] == 0) {
					count++;
				}
			}
			if(count >= 3) {
				break;
			}
		}
		System.out.println(result);
	}
}