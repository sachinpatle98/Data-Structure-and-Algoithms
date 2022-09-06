import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					  Scanner sc = new Scanner(System.in);
                      char a = sc.next().charAt(0);
					  char b = sc.next().charAt(0);
				

					  if (a=='R' || b=='R')
                 {
					  System.out.println('R');
					  }
					  else 
					  {
						  if (a=='J')
						  {
						System.out.println(b);  
					  }
					  else
					  {
						  if (b=='J')
						  {
                      System.out.println(a);
					  }
					  else {
						  System.out.println('D');
					  }
					  }
					  }


					  
					  	
	}
}