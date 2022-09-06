import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		
	Scanner sc=new Scanner(System.in);
					  int a=sc.nextInt();
					  int b=sc.nextInt();
					  int c=sc.nextInt();
					  int d=sc.nextInt();
					  int e=sc.nextInt();
					  int sum=a+b+c+d+e;
					  int per=sum/5;
					  char grade;
					  if(per >=80)
						  grade = 'A';					  
					  else if(per >=60)
						grade = 'B';
							   else if(per >=40)
                          grade = 'C';
						  else 
						  grade = 'D';
						  System.out.println(grade);


					
	}

}