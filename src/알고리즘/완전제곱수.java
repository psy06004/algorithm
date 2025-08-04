package 알고리즘;
import java.util.Scanner;

public class 완전제곱수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); 
		int count = 0; //만족하는 쌍의 개수
		for (int i = 1; i < 501; i++) {
			double A = Math.pow(i,2); 
			for (int j = 1; j < 501; j++) {
				double B = Math.pow(j, 2);
				if(A == B + N) count++;
			}
		}
		System.out.println(count);
	}
}