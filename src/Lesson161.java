
import java.util.Scanner;
// public static void main(String[] args) {
public class Lesson161 {
    public static void Task_1() {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        if (n<10 && n>=0){
            System.out.println("DIGIT");
        }else if (n>9 && n<100){
            System.out.println("NUM");
        }else{
            System.out.println("OTHER");
        }

    }
    public static void Task_2() {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt(),b= in.nextInt(),c= in.nextInt();
        if (a<b && a<c){
            if (b<c){
                System.out.print(a+" "+b+" "+c);
            }else{
                System.out.print(a+" "+c+" "+b);
            }
        }
        else if (b<a && b<c){
            if (a<c){
                System.out.print(b+" "+a+" "+c);
            }else{
                System.out.print(b+" "+c+" "+a);
            }
        }
        else if (c<b && c<a){
            if (b<a){
                System.out.print(c+" "+b+" "+a);
            }else{
                System.out.print(c+" "+a+" "+b);
            }
        }

    }
    public static void Task_3() {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt();
        if (a%100>10 && a%100<20){
            System.out.print(a+" TOPTOB");
        }else {
            switch (a % 10) {
                case 0:
                    System.out.print(a + " TOPTOB");
                    break;
                case 1:
                    System.out.print(a + " TOPT");
                    break;
                case 2:
                    System.out.print(a + " TOPTA");
                    break;
                case 3:
                    System.out.print(a + " TOPTA");
                    break;
                case 4:
                    System.out.print(a + " TOPTA");
                    break;
                case 5:
                    System.out.print(a + " TOPTOB");
                    break;
                case 6:
                    System.out.print(a + " TOPTOB");
                    break;
                case 7:
                    System.out.print(a + " TOPTOB");
                    break;
                case 8:
                    System.out.print(a + " TOPTOB");
                    break;
                case 9:
                    System.out.print(a + " TOPTOB");
                    break;
            }
        }
    }
    public static void Task_4() {
        Scanner in=new Scanner(System.in);
        Double a= in.nextDouble(), b= in.nextDouble();

        if (a<=0 && b<=0){
            System.out.print("no such x");
        }else if (a<0 && b>0){
            Double x=-b/a;
            System.out.printf("%.1f<x<%.1f",-x,x);
        }else if (a>0 && b<0){
            Double x=-b/a;
            System.out.printf("x<%.1f or x>%.1f",-x,x);
        }else if (a>=0 && b>0){
            System.out.print("any x");
        }else if(a>0 && b==0){
            System.out.print("0.0");
        }
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
            }
            task=in.nextInt();
        }
    }
}