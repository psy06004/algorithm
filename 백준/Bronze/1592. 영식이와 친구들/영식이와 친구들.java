import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //친구들 숫자
		int m = sc.nextInt(); //공 m번 받으면 게임 중단
		int l = sc.nextInt(); //공 받은 횟수 홀수: 시계방향으로 l번째에게 던짐/짝수:반시계방향으로
		
		int[] friends = new int[n]; //공을 받은 횟수를 자리순으로 배열
		int count = 0; //공 던지는 횟수
		int now = 0; //지금 공을 가진 사람의 자리
		friends[0] = 1; //1번자리 친구가 공을 먼저 받음
		
		while(friends[now] != m) {
			if(friends[now]%2 == 1) {
				if(now + l < n) {
					now = now + l;
					friends[now]++;
					count++;
				} else if(now + l >= n) {
					now = (now + l) - n;
					friends[now]++;
					count++;
				}
				
			}else if(friends[now]%2 == 0) {
				if(now - l >= 0) {
					now = now - l;
					friends[now]++;
					count++;
				}else if(now - l < 0) {
					now = n - (l - now);
					friends[now]++;
					count++;
				}
			}
		}
		System.out.println(count);
	}
}