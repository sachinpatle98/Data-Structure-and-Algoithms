import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {


public static void main (String[] args) {
                  Scanner sc = new Scanner(System.in);   
			 int T= sc.nextInt();
			 while (T-->0)
{
            int N = sc.nextInt();
	        int X = sc.nextInt();
        	if  (X>=10)
					   {
			 System.out.println("0");
                  }
				  else 
				  {
					  int ans = ((N-1)*10)-((N-1)*X);
					  System.out.println(ans);

				  }
}
}

}