
public class Ex072706 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int sum = 0;
			for(int i = 1; i<=1000; i++) {
				if (i%3 == 0 && i%5 != 0) {
					continue;
					} else {
			
			sum = sum+i;
						} 
				}
		System.out.println ("1~1000까지의 합 =" + sum);
			}
	}
