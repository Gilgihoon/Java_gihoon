
public class Ex072805 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		for(a=1; a<=5; a++) { //1���� 9���� 1�� ���� (ex. +=2 2�� ����)
			for (c=4; c>=a; c--) {// �� ���ڸ��� ��ĭ�� c=4 (�տ������� 4ĭ) ����
				System.out.print(" ");
			}
			for(b=1; b<=a*2-1; b++) {//a�� ������ Ŀ���� ���⿡ �߰��� b<=a �ο�
				System.out.print("*");
			}
			System.out.println(); //���� for���� �Ѱ� �� �ٽ� ���� �̵��Ͽ� ���
		}
		
		for(a=1; a<=5; a++) { //1���� 9���� 1�� ���� (ex. +=2 2�� ����)
			for (c=2; c<=a; c++) {// �� ���ڸ��� ��ĭ�� c=4 (�տ������� 4ĭ)
				System.out.print(" ");
			}
			for(b=9; b>=a*2-1; b--) {//a�� ������ Ŀ���� ���⿡ �߰��� b<=a �ο�
				System.out.print("*");
			}
			System.out.println(); //���� for���� �Ѱ� �� �ٽ� ���� �̵��Ͽ� ���
		}
	}
}
