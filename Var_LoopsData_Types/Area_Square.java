import java.io.*; // for handling input/output
import java.util.Scanner; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
 Scanner sc = new Scanner(System.in);
 int side = sc.nextInt();
 int Area = side * side;
	System.out.println(Area);
	}
}