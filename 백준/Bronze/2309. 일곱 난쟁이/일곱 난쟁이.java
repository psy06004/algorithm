import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] height = new int[9];
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			height[i] = sc.nextInt();
			// 다 더한 뒤 100을 빼고 두명씩 돌려서 더하면 같은 값이 나오는 애들을 배열에서 뺀다
			sum += height[i];
		}
		//오름차순 배열..
		for (int i = 8; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if(height[j]>height[j+1]) {
					int tmp = height[j];
					height[j] = height[j+1];
					height[j+1] = tmp;
				}
			}
		}
		int a = 0;
		int b = 0;
		for (int i = 0; i < height.length; i++) {
			for (int j = 0; j < height.length; j++) {
				if(sum-100 == height[i]+height[j]) {
					a = i;
					b = j;
				}
			}
		}
		//출력은 배열 처음부터끝까지 sysout 근데 if로 문제인 애들 숫자이면 컨티뉴
		
		for (int i = 0; i < height.length; i++) {
			if(i == a || i == b) continue;
			else {
				System.out.println(height[i]);
			}
		}
		
	}
}