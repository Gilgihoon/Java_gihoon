
public class Ex072804_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		for(a=9; a>=1;a-=2) { // 9���� 1�� �ɶ����� 2�� ���� (=2)
			for(b=-1; b<9-a; b++) { //
				System.out.print(" ");
			}
			for(c=1; c<=a; c++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}