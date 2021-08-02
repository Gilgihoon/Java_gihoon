
public class Ex072605 {

	public static void main(String[] args) {
		int score = (int)(Math.random()*100) +1;
		System.out.println("점수 : " + score);
		
		String grade;
		
		if (score >=90) {
			grade ="A";
		}else if (score>=80) {
			grade ="B";
		}else if (score>=70) {
			grade ="C";
		}else if (score>=60) {
			grade ="D";
		}else { 
			grade = "F";
			System.out.println("점수 : " + grade);
	}
	}
	
}
