
public class Ex072801 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c = 4;
		for(a=1; a<=9; a+=2) { 
			while (c <= a/2) {
				System.out.print(" ");
				a-- ;
			}
			// 1���� 9���� 2�� ����
		/*	if (a%2 == 0) continue; 
			// a�� 2�� ����� ���ٸ� ������� �ʵ��� continue ����
			// ���� for������ �ٽ� �̵�
			{ */
			
			
			/* for (c=1; c>=a/2; c++) {
				System.out.print(" ");	
			}*/ 

			// while �ռ�(method) ���, 
			
			
			for (b=1; b<=a; b++) {
				System.out.print("*");
			}
			
				System.out.println("");
			}
			
		}
	}