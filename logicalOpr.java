import java.util.*;
import java.io.*;
public class logicalOpr {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a:");
        a=sc.nextInt();
        System.out.println("enter b:");
        b=sc.nextInt();

        int bitwiseAnd = a & b; 
        System.out.println("Bitwise AND: " + bitwiseAnd);

        int bitwiseOr = a | b; 
        System.out.println("Bitwise OR: " + bitwiseOr);

        int bitwiseXor = a ^ b; 
        System.out.println("Bitwise XOR: " + bitwiseXor);

        int leftShift = a << 1; 
        System.out.println("Left Shift: " + leftShift);

        int rightShift = b >> 1; 
        System.out.println("Right Shift: " + rightShift);
    }
}
