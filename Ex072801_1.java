
public class Ex072801_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		for(a=1; a<=9; a+=2) { // 1���� 9���� 2�� ����
			for (c=4; c>=a/2; c--) 
				// c�� 4�� ����? �����ٺ��� ���� ������� ���� 4��, �� �ٸ��� 1�� �������� �۵�
				System.out.print(" ");	
			
			for (b=1; b<=a; b++) {
				System.out.print("*");
			}
			
				System.out.println("");
			}
			
		}
	}
		
/*		int i, j;
		for(i=1; i <=5; i+=2 ) { //���� ����
			for(j=9; i*2-1<=j; j--) { // ���� ����
				System.out.print("*");
			}
			System.out.println();
			}
		}
}*/