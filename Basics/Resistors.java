import java.io.*; // for handling input/output
import java.util.Scanner; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                
					  Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		double a = 0;
		for(int i= 0; i<n; i++){
			double r = sc.nextDouble();
			a +=1/r;
		}
		double ans = 1/a;
		System.out.println((int)ans);
	}
	}