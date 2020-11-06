import java.util.*;

public class Lesson15 {
    public static void Task_1() {
        Scanner in=new Scanner(System.in);
        double a=in.nextDouble();
        System.out.println(a>=3 && a<=8 ? true:false);
    }
    public static void Task_2() {
        Scanner in=new Scanner(System.in);
        double a=in.nextDouble();
        System.out.println((a>=-3 && a<=5) ||  (a>=9 && a<=15)? true:false);
    }
    public static void Task_3() {
        Scanner in=new Scanner(System.in);
        double a=in.nextDouble();
        System.out.println((a<-2) ||  (a>3 && a<6) ||  (a>9)? true:false);
    }
    public static void Task_4() {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        System.out.println( a/100>0 && a/1000==0 && a>0 && a%5==0 ? true:false);
    }
    public static void Task_5() {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt(),b=in.nextInt(),c=in.nextInt(),d=in.nextInt();
        System.out.println( a==-b || a==-c || a==-d || b==-c || b==-d || c==-d ? true:false);
    }
    public static void Task_6() {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt(),b=in.nextInt(),c=in.nextInt();
        System.out.println( a*b%2==0 && a*c%2==0 && c*b%2==0 ? true:false);
    }
    public static void Task_7() {
        Scanner in=new Scanner(System.in);
        double x=in.nextDouble(),y=in.nextDouble();
        System.out.println(y>1-x && x<1 && !(y<2*x*x && x<-1) ?"YES":"NO");
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int task=in.nextInt();
        while (task!=0) {
            switch (task) {
                case 1:
                    Task_1();
                    break;
                case 2:
                    Task_2();
                    break;
                case 3:
                    Task_3();
                    break;
                case 4:
                    Task_4();
                    break;
                case 5:
                    Task_5();
                    break;
                case 6:
                    Task_6();
                    break;
                case 7:
                    Task_7();
                    break;
            }
            task=in.nextInt();
        }
    }
}
