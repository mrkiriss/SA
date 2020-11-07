
import java.util.Scanner;
// public static void main(String[] args) {
public class Lesson182 {
    public static void Task_1() {
        Scanner in=new Scanner(System.in);
        String s="";
        int a=in.nextInt();
        while (a!=0){
            s+=String.valueOf(a%2);
            a/=2;
        }
        System.out.println(s);
    }
    public static void Task_2() {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),m[]=new int[n];
        for (int i=0;i<n;i++){
            m[i]=0;
        }
        for (int i=0;i<n-1;i++){
            int ind=in.nextInt();
            m[ind-1]=1;
        }
        for (int i=0;i<n;i++){
            if (m[i]==0){
                System.out.println(i+1);
            }
        }
    }
    public static void Task_3() {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),a,b;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                a=n*i+j+1;
                b=n*j+i+1;
                System.out.print(a==b?a+" ":"");
            }
        }

    }
    public static int factorial(int n) {
        return (n==1?1:factorial(n-1)*n);
    }
    public static void Task_4() {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        System.out.print(x==0?1:factorial(x));
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