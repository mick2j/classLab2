package classLab2;
import java.util.*;
import static java.lang.Math.PI;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter the radius of the circle");
		double radius = sc.nextFloat();
		
		double perimeter = Math.PI*radius*radius;
		double area = Math.PI * Math.pow(radius, 2);
		
		System.out.println(" The perimeter of your circle is " + perimeter + " And the area is " + area);
		
		sc.close();
	}

}
