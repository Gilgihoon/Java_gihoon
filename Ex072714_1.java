
public class Ex072714_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i = 0;
		 int j = 9;
		 for(int a=0; a<=5; a++) {
			 
		 for(int b=0; b<i; b++) {
		 System.out.print(" ");	 
		 }
		 
		 for(int b=0; b<=j; b++) {
		 System.out.print("*");	 
		 }
		 i++;
		 j-=2;
		 System.out.println("*");
		 }	 

}
}