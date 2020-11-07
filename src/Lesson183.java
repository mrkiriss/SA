import java.util.*;
// public static void main(String[] args) {
public class Lesson183 {
    public static void Task_1() {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),a=in.nextInt()-1,b=in.nextInt()-1,c=in.nextInt()-1,d=in.nextInt()-1;
        int m[]=new int[n];
        for(int i=1;i<n+1;i++){
            m[i-1]=i;
        }
        int l1=b-a,l2=d-c;
        for (int i=0;i<l1/2+1;i++){
            int x=m[a+i];
            m[a+i]=m[b-i];
            m[b-i]=x;
        }
        //for(int i=0;i<n;i++) System.out.print(m[i]+" ");
        //System.out.println("");
        for (int i=0;i<l2/2+1;i++){
            int x=m[c+i];
            m[c+i]=m[d-i];
            m[d-i]=x;
        }
        for(int i=0;i<n;i++) System.out.print(m[i]+" ");
    }
    public static void Task_2() {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),a[]=new int[n];
        for (int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.print(i%2==0?a[i]+" ":"");
        }
    }
    public static void Task_3() {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),a[]=new int[n];
        for (int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.print(a[i]%2==0?a[i]+" ":"");
        }
    }
    public static void Task_4() {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),a[]=new int[n],k=0;
        for (int i=0;i<n;i++){
            k+=(in.nextInt()>0?1:0);
        }
        System.out.println(k);
    }
    public static void Task_5() {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),a[]=new int[n+1],k=0;
        for (int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        for (int i=0;i<n-1;i++){
            k+=(a[i]<a[i+1]?1:0);
        }
        System.out.println(k);
    }
    public static void Task_6() {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),a[]=new int[n],k=0;
        k=in.nextInt();
        for (int i=1;i<n;i++){
            int nw=in.nextInt();
            k=(nw>k?nw:k);
        }
        System.out.println(k);
    }
    public static void Task_7() {
        Scanner in=new Scanner(System.in);
        long n=in.nextLong(),k,s=0;
        k=in.nextLong();
        for (long i=1;i<n;i++){
            long nw=in.nextLong();
            s+=(nw>k?1:0);
            k=nw;
        }
        System.out.println(s+1);
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