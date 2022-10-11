package classLab2;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		int num1 = sc.nextInt();
		
		
		for ( int i = 1; i <= 10; ++i ) {
		System.out.printf( "%d * %d = %d", num1, i, num1 * i );
		}
	}

}
