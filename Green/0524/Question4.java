// 사용자가 입력한 정수가 소수임을 확인하여 출력하는 프로그램
import java.util.Scanner;
public class Question4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("어떤 수를 알고 싶은가요? ");
		int input = sc.nextInt();

		boolean on = true;
		if (input > 1) {
			
			// while (on) {
			
				for (int i = 2; i < input; i++) {
				
					if (input % i == 0) {
						System.out.print(input + " : 소수가 아닙니다.");
						on = false;
						break;
					}
				}
		
				if (on) {
					System.out.print(input + " : 소수입니다.");
					on = false;
					}
			// }
		}

		else {
			System.out.print("다시 실행하세요");
		}
	}
}

/*
[ 소수 설명 ]
1. 소수란 ? 약수가 2개인 수
	ex) 2 = 2 * 1 ... <<< 약수가 2, 1 >>>						2는 소수
		10 = (10 * 1) 또는 (5 * 2) ... << 약수가 1, 2, 5, 10>>	10은 소수가 아님
>>>> 이 말을 다르게 생각하면 2, 3, 5, 7 등등 소수의 배수를 이용하면 소수를 확인할 수 있다.

2를 제외하고 2의 배수라는 말은 약수 중에 2가 포함되어 있기 때문에 소수가 아니다.

(x % 2 == 0) >> x가 2의 배수이면 true // 2의 배수가 아니면 false 를 출력하는 식이다. (여태 많이 써먹음)
2의 값을 3, 5, 7 등등등 원하는 수로 바꿔주면 원하는 수의 배수인지 아닌지 확인이 가능하다.

>>>> 소수 확인하는 방법 = (입력받은 수 % 2 == 0) 이거나 (입력받은 수 % 3 == 0) ... 등등 --> 이 값이 0 이면 즉, true 면 소수가 아니다.

2. 소수는 2부터 시작 한다 (1은 소수 아님)

[ 프로그램 진행 설명 ]
문제 /// 사용자가 입력한 정수가 소수임을 확인하여 출력하는 프로그램
1. 사용자가 입력한 정수
	사용자로부터 정수를 입력 받아야 한다 >>>> input 이라는 변수를 int 타입으로 선언해서 입력 받아준다.

2. 소수임을 확인하여
	2-1. 소수 확인하는 방법인 (입력받은 수 % x == 0) 이 식에서 일일히 x를 소수의 배수로 바꿔서 출력하는 방법도 있다.
		하지만 너무 귀찮기 때문에 x를 프로그램이 자동으로 숫자를 바꿔서 계산하게 만들고 싶다.

>>>>	그래서 조건에 따라 알아서 실행하는 반복문인 while for 를 사용한다.
		일단 소수 확인 하는 방법에서 소수가 아닐 때 조건을 알기 때문에
		소수가 아닌 경우를 확인 하고 싶다
		if (input % 반복하고 싶은 수 == 0) {
			소수가 아닌 경우에 출력하고 싶은 내용
		}	여기서 반복하고 싶은 수를 변수 i 로 잡은 반복문을 사용한다.
		
		for ( ) {
			이 블록안에 if 를 넣어주면 된다.
		}
		>> for의 조건은 0이나 1부터 시작하면 % 의미가 없다.
		그래서 2부터 시작한다.
		범위는 input 이랑 같으면 의미가 없다. 그래서 input 미만까지.
		
		if (   ) {
			소수인 경우에 출력하고 싶은 내용
		}
		
		이런식으로 어떤 결과물이 나와야 하는지 하나씩 하나씩 써본다.
		조건이나 디테일한 부분은 하나씩 컴파일 실행 해보면서
		고치거나 붙여나가면 된다.
		
	2-2. boolean 변수로 스위치를 만드는 방법이 편하고 이해하기도 좋아서
	이 프로그램에도 써보려고 처음엔 while ( ) 로 스위치를 만들어 줬는데
	완성시켜보고 나니 if 에도 스위치를 넣어줄 수가 있다.
	반복할 내용이 없으면 while 이 불필요하다.
	
	<<<기본 프로그램 진행 흐름은 위에서 아래로 내려가는 흐름이다.>>>
	if 를 통해서 input 이 들어오고
	반복문인 for 에서 수식대로 반복을 하면서 소수가 아닌 경우를 확인하는 과정을 거치는데
	소수가 아닌 경우에는 스위치를 꺼줘서 소수인 경우의 if 문에 흐름이 들어가지 않게 하고
	break 로 찾은 즉시 반복문을 탈출하게 만들어서 종료 시킨다.
	for 문에서 반복을 다 했는데 % i 가 0 이 아니면 소수라서
	그 밑의 if 로 내려간다.
	
	if ( ) 조건문도 true 일 때 실행되는 사실을 따로 생각해본적이 없었던 것 같다.
		
	2-3. 소수는 2부터 시작한다 >>>> 입력 받는 정수(input) 1보다 커야 소수인지 아닌지 확인이 가능하다
>>>>	if (input > 1) 이런 조건으로
		{ 블록 } 블록 안에 들어갈 내용을 필터링 (한 번 걸러준다).
		
		그 외 (input <= 1) 인 경우는 else 문으로 프로그램 종료를 하던 다시 입력하라고 하던
		원하는대로 만들어준다.
 */