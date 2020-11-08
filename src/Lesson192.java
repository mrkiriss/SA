import java.util.Scanner;
// public static void main(String[] args) {
public class Lesson192 {
    public static double lenSide(double x1, double y1,double x2, double y2){
        return Math.pow((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1),0.5);
    }
    public static void Task_1() {
        Scanner in=new Scanner(System.in);
        double x1=in.nextDouble(),y1=in.nextDouble(),x2=in.nextDouble(),y2=in.nextDouble(),x3=in.nextDouble(),y3=in.nextDouble();
        double ans=lenSide(x1,y1,x2,y2)+lenSide(x1,y1,x3,y3)+lenSide(x3,y3,x2,y2);
        System.out.printf("%.10f",ans);
    }
    static int min (int a, int b, int c, int d){
        if (b<a) a=b;
        if (d<a) a=d;
        if (c<a) a=c;
        return a;
    }
    public static void Task_2() {
        Scanner in=new Scanner(System.in);
        System.out.print(min(in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt()));
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
            }
            task=in.nextInt();
        }
    }
}