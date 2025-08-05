import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String으로 입력받고 나눠서 int로 저장
		String time = sc.next();
		String[] parts = time.split(":");
		int time1 = Integer.parseInt(parts[0]);
		int time2 = Integer.parseInt(parts[1]);
		int time3 = Integer.parseInt(parts[2]);
		int[] arr = {time1, time2, time3};
		int h = 0; //시로 읽을 수 있는 숫자의 수
		int result = 0;
		for (int i = 0; i < arr.length; i++) { 
			if(arr[i] > 59) { //범위 초과 시 0 출력
				h = 0;
				break;
			}
			if(arr[i] >= 1 && arr[i] <= 12) h++;
		}
		if(h==0) result = 0;
		if(h==1) result = 2;
		if(h==2) result = 4;
		if(h==3) result = 6;
		
		System.out.println(result);
	}
}