import java.util.*;
import java.io.*;
class Time{
    int hrs;
    int min;

    public Time(int hrs, int min){
        this.hrs=hrs;
        this.min=min;
        change();
    }
    public void change(){
        if(min>=60){
            hrs += min/60;
            min %= 60;
        }
        if(hrs >= 24){
            hrs %= 24;
        }
    }
    public Time sum(Time t){
        int tHrs = this.hrs + t.hrs;
        int tMin = this.min + t.min;
        return new Time(tHrs, tMin);
    }
    public void disp(){
        System.out.println(hrs +" Hours " + min +" Minutes");
    }
}
public class timesum{
    public static void main(String[] args) {
        int h1,m1;
        Time time3;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter hours and min:");
        h1=sc.nextInt();
        m1=sc.nextInt();
        Time time1 = new Time(h1,m1);
        System.out.println("enter hours and min:");
        h1=sc.nextInt();
        m1=sc.nextInt();
        Time time2 = new Time(h1,m1);
        System.out.println("Time 1:");
        time1.disp();
        System.out.println("Time 2:");
        time2.disp();
        time3=time1.sum(time2);
        System.out.println("sum:");
        time3.disp();
    }
}
