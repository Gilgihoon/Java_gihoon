
public class Ex072801 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c = 4;
		for(a=1; a<=9; a+=2) { 
			while (c <= a/2) {
				System.out.print(" ");
				a-- ;
			}
			// 1부터 9까지 2씩 증가
		/*	if (a%2 == 0) continue; 
			// a가 2의 배수와 같다면 출력하지 않도록 continue 설정
			// 상위 for문으로 다시 이동
			{ */
			
			
			/* for (c=1; c>=a/2; c++) {
				System.out.print(" ");	
			}*/ 

			// while 합수(method) 사용, 
			
			
			for (b=1; b<=a; b++) {
				System.out.print("*");
			}
			
				System.out.println("");
			}
			
		}
	}