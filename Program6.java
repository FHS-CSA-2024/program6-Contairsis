//import stuff here!
import java.util.Scanner;
//Your code here
public class Program6 {
    public static void main(String[] args) {
        final double pi = 3.14159;
        double radius = 0;
        double circum = 0;
        double area = 0;
        double diam = 0;
        Scanner radScanner = new Scanner(System.in);
        System.out.println("Enter the radius(x.xxx)");
        radius = radScanner.nextDouble();
        diam = (int)(((radius * 2) * 1000) + 0.5) / 1000.0;
        area = (int)(((pi * radius * radius) * 1000) + 0.5) / 1000.0;
        circum = (int)(((pi * diam) * 1000)+ 0.5) / 1000.0;
        radius = (int)((radius * 1000) + 0.5)/1000.0;
        System.out.println("The Radius of the circle = " + radius + "\n");
        System.out.println("The Diameter of the circle = " + diam + "\n");
        System.out.println("The Area of the circle = " + area + "\n");
        System.out.print("The Circumfrence of the circle = " + circum);
    }
}
//Paste console output below:
/*
Enter the radius(x.xxx)
3.712
The Radius of the circle = 3.712

The Diameter of the circle = 7.424

The Area of the circle = 43.288

The Circumfrence of the circle = 23.323

*/
