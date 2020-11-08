import java.util.Scanner;
// public static void main(String[] args) {
public class Lesson111 {

    public static void Task_1() {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),m=in.nextInt(), a[][]=new int[m][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                a[j][n-i-1]=in.nextInt();
            }
        }
        System.out.println(m+" "+n);
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public static void Task_2() {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(), a[][]=new int[n][n];
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                int x=0;
                if (i+j+1==n) x=1;
                if (i+j+1>n) x=2;
                if (i+j+1<n) x=0;
                System.out.print(x+" ");
            }
            System.out.println("");
        }
    }

    public static void Task_3() {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(), a[][]=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                a[i][j]=in.nextInt();
            }
        }
        boolean bl=true;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (a[i][j]!=a[j][i]){
                    bl=false;
                    break;
                }
            }
        }
        System.out.print(bl?"yes":"no");
    }

    public static void Task_4() {
        Scanner in = new Scanner(System.in);
        Integer n=in.nextInt(),m=in.nextInt();
        for (int k=0;k<n*m;k++){
            int x=(k%m)*(k/m);
            String str=String.valueOf(x);
            while (str.length()!=4) str=" "+str;
            System.out.print(str);
            if (k%m==m-1){
                System.out.println("");
            }
        }
    }

    public static void Task_5() {
        Scanner in=new Scanner(System.in);
        int k=0;
        int n=in.nextInt(),m=in.nextInt(),a[][]=new int[n][m];
        for (int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                a[i][j]=(i%2==0?j+m*i:(i+1)*m-j-1);
            }
        }
        for (int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                String str=String.valueOf(a[i][j]);
                while (str.length()!=3) str=" "+str;
                System.out.print(str);
            }
            System.out.println("");
        }
    }

    public static void Task_6() {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),id=0,i=n,j=n,s=0;
        n=2*n+1;
        int a[][]=new int[n][n];
        while (s!=n*n){
            a[i][j]=s++;
            switch (id%4){
                case 0:
                    i--;
                    id+=(i+j+2==n?1:0);
                    break;
                case 1:
                    j--;
                    id+=(i==j?1:0);
                    break;
                case 2:
                    i++;
                    id+=(i+j+1==n?1:0);
                    break;
                case 3:
                    j++;
                    id+=(i==j?1:0);
                    break;
            }
        }
        for ( i=0;i<n;i++) {
            for ( j = 0; j < n; j++) {
                String str=String.valueOf(a[i][j]);
                while (str.length()!=3) str=" "+str;
                System.out.print(str);
            }
            System.out.println("");
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