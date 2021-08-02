
public class Ex072801_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		for(a=1; a<=9; a+=2) { // 1부터 9까지 2씩 증가
			for (c=4; c>=a/2; c--) 
				// c가 4인 이유? 맨윗줄부터 앞쪽 빈공간의 갯수 4번, 매 줄마다 1씩 빠지도록 작동
				System.out.print(" ");	
			
			for (b=1; b<=a; b++) {
				System.out.print("*");
			}
			
				System.out.println("");
			}
			
		}
	}
		
/*		int i, j;
		for(i=1; i <=5; i+=2 ) { //행의 갯수
			for(j=9; i*2-1<=j; j--) { // 열의 갯수
				System.out.print("*");
			}
			System.out.println();
			}
		}
}*/