import java.util.Scanner; //�ڷᰪ�� �о���϶� �ʿ� (���)

public class Ex072902 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in); //����� ����� ���Ӱ� �����ϴ°�
		while(run) { //�ݺ���
			System.out.println("------------------------------");
			System.out.println("1.���� | 2.��� | 3. �ܰ� | 4.����");
			System.out.println("------------------------------");
			System.out.print("����> ");

			int number = scanner.nextInt();
			int money = 0;
			
			switch (number) { //if, else if�� ���� ���� (�� ��� �ϴ� case ���ʿ�)
			if (money = scanner.nextInt());
			balance += money;
			break;
			System.out.print("���ݾ�>");
	
			if System.out.print("��ݾ�>");
			money = scanner.nextInt();
			balance -= money;
			break;
			System.out.print("��ݾ�>");
			
		case 3:
			System.out.println("�ܰ�>" + balance);
			break;
		case 4:
			run = false;
			break;
			
			}
					
		}		
		System.out.println("���α׷� ����");
		scanner.close();
	}
}