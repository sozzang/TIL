import java.util.Scanner;
public class SumAvgUser {
	public static void main(String[] args) {
		// 사용자가 먼저 정해서 입력한 n개의 정수의 합과 평균
		Scanner sc = new Scanner(System.in);
		
		// 입력
		System.out.println("n개의 정수 입력.");
		int count = sc.nextInt();
		
		int sum = 0;
		for (int i = 0; i < count; i++) {
			// 연산
			sum += sc.nextInt();
			}
		// 출력
		System.out.println("합: " + sum);
		System.out.println("평균: " + sum / count);
	}
}