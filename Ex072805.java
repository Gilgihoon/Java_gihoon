
public class Ex072805 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		for(a=1; a<=5; a++) { //1에서 9까지 1씩 증가 (ex. +=2 2씩 증가)
			for (c=4; c>=a; c--) {// 맨 앞자리의 빈칸을 c=4 (앞에서부터 4칸) 감소
				System.out.print(" ");
			}
			for(b=1; b<=a*2-1; b++) {//a의 값보다 커질수 없기에 중간값 b<=a 부여
				System.out.print("*");
			}
			System.out.println(); //위의 for문의 둘고난 후 다시 위로 이동하여 계산
		}
		
		for(a=1; a<=5; a++) { //1에서 9까지 1씩 증가 (ex. +=2 2씩 증가)
			for (c=2; c<=a; c++) {// 맨 앞자리의 빈칸을 c=4 (앞에서부터 4칸)
				System.out.print(" ");
			}
			for(b=9; b>=a*2-1; b--) {//a의 값보다 커질수 없기에 중간값 b<=a 부여
				System.out.print("*");
			}
			System.out.println(); //위의 for문의 둘고난 후 다시 위로 이동하여 계산
		}
	}
}
