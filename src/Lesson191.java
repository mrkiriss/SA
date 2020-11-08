import java.util.Scanner;
// public static void main(String[] args) {
public class Lesson191 {
    public static int SumDigits(int a){
        int s=0;
        while (a!=0){
            s+=a%10;
            a/=10;
        }
        return s;
    }
    public static void Task_1() {
        Scanner in=new Scanner(System.in);
        System.out.print(SumDigits(in.nextInt()));
    }

    public static int Sum1(){
        int s=0;
        for (int i=10;i<100;i++){
            s+=(i%7==0?SumDigits(i):0);
        }
        return s;
    }
    public static void Task_2() {
        Scanner in=new Scanner(System.in);
        System.out.print(Sum1());
    }
    public static int Num1(int a){
        int k=0;
        for (int i=a-1;i>99;i--){
            k+=(SumDigits(i)%13==0?1:0);
        }
        return k;
    }
    public static void Task_3() {
        Scanner in=new Scanner(System.in);
        System.out.print(Num1(in.nextInt()));
    }
    public static String For4(double a,int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            a *= 2;
            Integer intg = (int) a;
            a -= intg;
            s += String.valueOf(intg);
        }
        return s;
    }
    public static void Task_4() {
        Scanner in = new Scanner(System.in);
        System.out.print(For4(in.nextDouble(),in.nextInt()));
    }
    public static double SrSumIf(int[] a){
        double s=0,k=0;
        for (int i=0;i<a.length;i++){
            if(a[i]>999 && a[i]<10000){
                s+=a[i];
                k++;
            }
        }
        return (k==0?-1:s/k);
    }
    public static void Task_5() {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),a[]=new int[n];
        for (int i=0;i<n;i++){
            a[i]= in.nextInt();
        }
        System.out.printf("%.2f",SrSumIf(a));
    }
    public static void For6(int[] a){
        int min=a[0],indMin=0;
        for (int i=1;i<a.length;i++){
            if (a[i]<min){
                min=a[i];
                indMin=i;
            }
        }
        for (int i=indMin;i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=min;
    }
    public static void Task_6() {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),a[]=new int[n];
        for (int i=0;i<n;i++){
            a[i]= in.nextInt();
        }
        For6(a);
        for (int i=0;i<n;i++){
            System.out.print(a[i]+" ");
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