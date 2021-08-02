
public class Ex072804 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 0;
		int d = 9;
		 for(int a=0; a<=5; a++) {
			 
		 for(int b=0; b<c; b++) {
		 System.out.print(" ");	 
		 }
		 
		 for(int b=0; b<=d; b++) {
		 System.out.print("*");	 
		 }
		 c++;
		 d-=2;
		 System.out.println("*");
		 }	 

	}
}



/*		 int i = 0;
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
}*/