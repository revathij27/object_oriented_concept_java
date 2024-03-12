import java.util.*;
import java.io.*;
class Rectangle {
    double l;
    double w;
    public Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }
    public double calculateArea() {
        return l * w;
    }
    public double calculatePerimeter() {
        return 2 * (l + w);
    }
    public static boolean compare(Rectangle r1, Rectangle r2) {
        return r1.calculateArea() == r2.calculateArea();
    }
}

public class rectAreaSame {
    public static void main(String[] args) {
        int l1,r1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length and breadth of rect1:");
        l1=sc.nextInt();
        r1=sc.nextInt();
        Rectangle rect1 = new Rectangle(l1,r1);
        System.out.println("enter the length and breadth of rect2:");
        l1=sc.nextInt();
        r1=sc.nextInt();
        Rectangle rect2 = new Rectangle(l1,r1);
        System.out.println("Area of Rectangle 1: " + rect1.calculateArea());
        System.out.println("Perimeter of Rectangle 1: " + rect1.calculatePerimeter());
        System.out.println("Area of Rectangle 2: " + rect2.calculateArea());
        System.out.println("Perimeter of Rectangle 2: " + rect2.calculatePerimeter());

        if (Rectangle.compare(rect1, rect2)) {
            System.out.println("Both rectangles have the same area.");
        } else {
            System.out.println("The rectangles have different areas.");
        }
    }
}


