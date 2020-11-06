import java.util.*;
// public static void main(String[] args) {
public class Lesson171 {
    public static void Task_1() {
        Scanner in=new Scanner(System.in);
        int x,k=0;
        do {x= in.nextInt();k++;}
        while (x>=0);
        System.out.println(k);
    }
    public static void Task_2() {
        Scanner in=new Scanner(System.in);
        int x,k=0;
        do {
            x= in.nextInt();
            k+=x>10?x:0;
        }
        while (x%5!=0);
        System.out.println(k);
    }
    public static void Task_3() {
        Scanner in=new Scanner(System.in);
        int x,k=0;
        do {
            x= in.nextInt();
            k+=x>9 && x<100? x/10+x%10 :0;
        }
        while (x>9 && x<100);
        System.out.println(k);

    }
    public static void Task_4() {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt(), b= in.nextInt(),k=0;
        while (a-b>=0){
            k++;
            a-=b;
        }
        System.out.print(k);
        System.out.print(' ');
        System.out.println(a);
    }
    public static void Task_5() {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt(),k=0;
        while(a>0){
            a/=2;
            k++;
        }
        System.out.println(k);
    }
    public static void Task_6() {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt(),k=0;
        for (int i=25;i<=a;i++){
            k+=i%2==0?i:0;
        }
        System.out.println(k);
    }
    public static void Task_7() {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt(),k=0;
        while (a>0){
            k++;
            a/=10;
        }
        System.out.println(k);
    }
    public static void Task_8() {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt(),k=-1;
        while (a>0){
            if ((a%10)%2==1){
                k=a%10;
                break;
            }
            a/=10;
        }
        System.out.println(k==-1?"NO":k);
    }
    public static void Task_9() {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt(),k=10;
        while (a>0){
            if ((a%10)<k && (a%10)>0){
                k=a%10;
            }
            a/=10;
        }
        System.out.println(k);
    }
    public static void Task_10() {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt();
        while (true){
            a++;
            boolean bl=true;
            for (int i=2;i<a;i++){
                if(a%i==0){
                    bl=false;
                    break;
                }
            }
            if (bl){
                System.out.println(a);
                break;
            }
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
                case 7:
                    Task_7();
                    break;
                case 8:
                    Task_8();
                    break;
                case 9:
                    Task_9();
                    break;
                case 10:
                    Task_10();
                    break;
            }
            task=in.nextInt();
        }
    }
}