import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		
		//문자열로 받은 입력값 한자리씩 돌면서 숫자 카운트
		int[] set = new int[10];
		for (int i = 0; i < N.length(); i++) {
			set[N.charAt(i)-'0']++;
		}
		
		//6과 9 값 설정
		if((set[6] + set[9])%2 == 0) {
			set[6] = (set[6] + set[9])/2;
			set[9] = set[6];
		}else if((set[6] + set[9])%2 == 1) {
			set[6] = (set[6] + set[9])/2 + 1;
			set[9] = set[6];
		}
		
		//최댓값 얻기
		int max = 0;
		for (int i = 0; i < set.length; i++) {
			max = Math.max(max, set[i]);
		}
		System.out.println(max);
	}
}