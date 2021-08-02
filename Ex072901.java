import java.util.Scanner; //자료값을 읽어들일때 필요 (모듈)

public class Ex072901 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in); //사용할 모듈을 새롭게 정의하는것
		while(run) { //반복문
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3. 잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택> ");

			int number = scanner.nextInt();
			int money = 0;
			
			switch (number) { //if, else if로 변경 가능 (그 경우 하단 case 불필요)
				case 1:
					System.out.print("예금액>");
					money = scanner.nextInt();
					balance += money;
					break;
				case 2:
					System.out.print("출금액>");
					money = scanner.nextInt();
					balance -= money;
					break;
				case 3:
					System.out.println("잔고>" + balance);
					break;
				case 4:
					run = false;
					break;		
			}
		}		
		System.out.println("프로그램 종료");
		scanner.close();
	}
}
