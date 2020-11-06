import java.util.*;
// public static void main(String[] args) {
public class Lesson172 {
    public static void Task_1() {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt(),x=0;
        for (int i=0;i<n;i++){
            x= in.nextInt();
            if (x<=437){
                System.out.print("Crash ");
                System.out.println(i+1);
                break;
            }
        }
        if (x>473){
            System.out.println("No crash");
        }
    }
    public static void Task_2() {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt(),b= in.nextInt(),s=0;
        if (a>0 && b>0 || a<0 && b<0){
            a=Math.abs(a);
            b=Math.abs(b);
        }else{
            if (a<b){
                int c=a;
                a=b;
                b=c;
            }
        }
        while (a!=0){
            a--;
            s+=b;
        }
        System.out.println(s);
    }
    public static void Task_3() {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt(),k=1;
        while (k!=n){
            System.out.print(k*2);
            System.out.print(' ');
            k++;
        }
        System.out.print(k*2);
    }
    public static void Task_4() {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt(),b= in.nextInt(),c= in.nextInt(),d= in.nextInt(),k=0;
        for (int i=10000;i<100000;i++){
            if (i%a==b && i%c==d){
                k++;
                System.out.print(i);
                System.out.print(' ');
            }
        }
        if (k==0){
            System.out.println(-1);
        }
    }
    public static void Task_5() {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt(),s=0;
        while (a != 0) {
            s+=a%10;
            a/=10;
        }
        System.out.print(s);
    }
    public static void Task_6() {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt(),l=a%10;
        a=a/10;
        while (a!=0){
            if (l==a%10){
                l=-1;
                break;
            }
            l=a%10;
            a/=10;
        }
        System.out.println(l!=-1?"NO":"YES");
    }
    public static void Task_7() {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt();
        boolean bl=true;
        for (int i=2;i<a;i++){
            if(a%i==0){
                bl=false;
                break;
            }
        }
        System.out.println(bl?"prime":"composite");
    }
    public static Double pw(double a,long n) {
        if (n==0) return 1.0;
        return (n%2==0 ? pw(a*a,n/2):a*pw(a,n-1));
    }
    public static void Task_8() {
        Scanner in=new Scanner(System.in);
        Double a= in.nextDouble(),ans;
        Long n= in.nextLong();
        ans=pw(a,n);
        Integer ost=ans.intValue();
        if (ans-ost==0){
            System.out.println(ans.intValue());
        }else{
            System.out.println(ans);
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
            }
            task=in.nextInt();
        }
    }
}