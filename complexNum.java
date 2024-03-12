import java.io.*;
import java.util.*;
class Complex{
    float r;
    float i;
    Scanner sc=new Scanner(System.in);
    public void read(){
        try{
            System.out.println("Enter the value for r:");
            r=sc.nextFloat();
            System.out.println("Enter the value for i:");
            i=sc.nextFloat();

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public void disp(){
        System.out.println("r= " + r + "i= " + i);
    }
    public Complex sum(Complex q){
        Complex t= new Complex();
        t.r= r + q.r;
        t.i= i + q.i;
        return t;
    }
}
public class complexNum {
    public static void main(String[] args) {
        Complex p,q,r;
        p=new Complex();
        q=new Complex();
        p.read();
        q.read();
        r=p.sum(q);
        p.disp();
        q.disp();
        r.disp();
    }
}
