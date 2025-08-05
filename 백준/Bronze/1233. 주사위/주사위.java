import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S1 = sc.nextInt();
		int S2 = sc.nextInt();
		int S3 = sc.nextInt();
		int[] arr = new int[S1+S2+S3]; // 주사위 합의 개수 배열
		for (int i = 1; i <= S1; i++) {
			for (int j = 1; j <= S2; j++) {
				for (int k = 1; k <= S3; k++) {
					arr[i+j+k-1]++;
				}
			}
		}
		int max = 0;
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i]; // 최댓값 도출 후 저장+최댓값 여러개면 가장 작은 합 저장 
				result = i+1;
			}
		}
		
		System.out.println(result);
	}
}