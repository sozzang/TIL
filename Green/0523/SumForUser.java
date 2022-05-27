import java.util.Scanner;
public class SumForUser {
	public static void main(String[] args) {
		// 사용자가 정수 범위를 지정 (시작-끝 입력)
		// 합
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		System.out.printf("%d부터 %d까지의 합 = %d\n", start, end, sum);
	}
}