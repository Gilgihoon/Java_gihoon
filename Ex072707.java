
public class Ex072707 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		boolean run = true;
		int speed = 0;
		int keycode = 0;
		
		while(run) {
			if(keycode!=13 && keycode!=10) {
				System.out.println("---------------------");
				System.out.println("1.���� | 2.���� | 3. ����");
				System.out.println("---------------------");
				System.out.println("���� : ");
			}

	keycode = System.in.read();
	
	if (keycode == 49) {
		speed++;
		System.out.println("����ӵ� =" + speed);
	}else if (keycode == 50) {
		speed--;
		System.out.println("����ӵ� =" + speed);
	}else if (keycode == 51) {
		run = false;
	}
	}
	
	
	System.out.println("���α׷� ����");
	}
}
