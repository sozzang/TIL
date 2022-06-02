import java.util.Scanner;

public class Student {
		Scanner sc = new Scanner(System.in);
		private Score stu1;
		private Score stu2;
		private Score stu3;
				
		public Student(Score stu1, Score stu2, Score stu3, Score stu4) {
			this.stu1 = stu1;
			this.stu2 = stu2;
			this.stu3 = stu3;
		}
		
		public Student() {
			
		}
		
		public Score setScore(Score stu) {
			System.out.print("반:  ");
			stu.setClassnum(sc.nextInt());
			System.out.println();
		
			System.out.print("학생 이름:  ");
			sc.nextLine();
			stu.setName(sc.nextLine());
			System.out.println();
			
			System.out.print("국어:  ");
			stu.setKor(sc.nextInt());
			System.out.println();
			
			System.out.print("영어:  ");
			stu.setEng(sc.nextInt());
			System.out.println();
			
			System.out.print("수학:  ");
			stu.setMath(sc.nextInt());
			System.out.println();
			
			return stu;
		}
		
		public void mainLogic() {
			
			Score stu1 = new Score();
			Score stu2 = new Score();
			Score stu3 = new Score();
					
		while (true) {
		
			System.out.println("학생 관리 프로그램");
			System.out.println("*** 1. 등록 *** 2. 이름 목록 *** 3. 평균 *** 4. 1등 학생? *** 5. 종료");
			System.out.print(">>>     ");
			int choice = sc.nextInt();
		
			if (choice == 1) {
				this.stu1 = setScore(stu1);
				this.stu2 = setScore(stu2);
				this.stu3 = setScore(stu3);
			}
			
			if (choice == 2) {
				System.out.println(stu1.getName());
				System.out.println(stu2.getName());
				System.out.println(stu3.getName());
			}
			
			if (choice == 3) {
				stu1.getAveragePrint();
				stu2.getAveragePrint();
				stu3.getAveragePrint();
			}
			
			if (choice == 4) {
				if (stu1.getAverage() >= stu2.getAverage() && stu1.getAverage() >= stu3.getAverage()) {
					System.out.println(stu1.getName());
				} else if (stu2.getAverage() >= stu3.getAverage() && stu2.getAverage() >= stu1.getAverage()) {
					System.out.println(stu2.getName());
				} else {
					System.out.println(stu3.getName());
				}
			}
			
			if (choice == 5) {
				break;
			}
			
			else {
				System.out.print("다시 입력 >>>     ");
			}
		}
	}
}