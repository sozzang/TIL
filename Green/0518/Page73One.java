// page73.1번.2번.3번
// page101.2번
// page102.6번
// 사용자가 입력한 5자리의 정수를 역순으로 출력하는 프로그램 예) 12345 -> 54321

import java.util.Scanner;

public class Page73One {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("마일을 입력하시오: ");
		double mile = input.nextDouble();
		
		double kilom = (1.609 * mile);
		System.out.println(mile + "마일은 " + kilom + "킬로미터입니다.");
	}
}