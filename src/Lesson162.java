import java.util.*;
// public static void main(String[] args) {
public class Lesson162 {
    public static void Task_1() {
        Scanner in=new Scanner(System.in);
         int n=in.nextInt(),x;
         switch (n){
             case 1:
                x=31;
                break;
             case 2:
                 x=28;
                 break;
             case 3:
                 x=31;
                 break;
             case 4:
                 x=30;
                 break;
             case 5:
                 x=31;
                 break;
             case 6:
                 x=30;
                 break;
             case 7:
                 x=31;
                 break;
             case 8:
                 x=31;
                 break;
             case 9:
                 x=30;
                 break;
             case 10:
                 x=31;
                 break;
             case 11:
                 x=30;
                 break;
             case 12:
                 x=31;
                 break;
             default:
                 x=0;
                 break;
         }
         System.out.println(x);
    }
    public static void Task_2() {
        Scanner in=new Scanner(System.in);
        int m=in.nextInt(),d=in.nextInt();
        int arr0[] = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
        int arr[]=new int[] {0,31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
        if (m>12 || m<1 || d>arr0[m-1] || d<1){
            System.out.println(-1);
        }else{
            System.out.println(365-(arr[m-1]+d));
        }
    }
    public static void Task_3() {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String s="";
        if (n==100){
            s+="C";
            n=0;
        }
        if (n>=90){
            s+="XC";
            n-=90;
        }
        if (n>=50) {
            s += "L";
            n -= 50;
        }
        if (n>=40) {
            s += "XL";
            n -= 40;
        }
        while (n>=10) {
            s += "X";
            n -= 10;
        }
        if (n>=9) {
            s += "IX";
            n -= 9;
        }
        if (n>=5) {
            s += "V";
            n -= 5;
        }
        if (n>=4) {
            s += "IV";
            n -= 4;
        }
        while (n>=1) {
            s += "I";
            n -= 1;
        }
        System.out.println(s);
    }
    public static void Task_4() {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt(),b= in.nextInt(),c= in.nextInt();
        if (b>a) a=b;
        if (c>a) a=c;
        System.out.print(a);
    }
    public static void Task_5() {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt(),b= in.nextInt(),c= in.nextInt();
        int m[] = new int[] {a,b,c};
        for (int i=0;i<3-1;i++){
            for (int j=i+1;j<3;j++) {
                if (m[i] > m[j]) {
                    int x = m[i];
                    m[i] = m[j];
                    m[j] = x;
                }
            }
        }
        System.out.print(m[0]+" "+m[1]+" "+m[2]);
    }
    public static void Task_6() {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt(),b= in.nextInt(),c= in.nextInt();
        if (a+b>c && a+c>b && b+c>a) {
            int m[] = new int[]{a, b, c};
            for (int i = 0; i < 3 - 1; i++) {
                for (int j = i + 1; j < 3; j++) {
                    if (m[i] > m[j]) {
                        int x = m[i];
                        m[i] = m[j];
                        m[j] = x;
                    }
                }
            }
            a = m[0];
            b = m[1];
            c = m[2];
            if (a * a + b * b == c * c) {
                System.out.println("right");
            } else if (c * c > a * a + b * b) {
                System.out.println("obtuse ");
            } else {
                System.out.println("acute ");
            }
        }else{
            System.out.println("impossible");
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
                case 5:
                    Task_5();
                    break;
                case 6:
                    Task_6();
                    break;
            }
            task=in.nextInt();
        }
    }
}