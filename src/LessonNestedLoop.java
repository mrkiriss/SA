import java.util.Scanner;
// public static void main(String[] args) {
public class LessonNestedLoop {

    public static void Task_1() {
        Scanner in=new Scanner(System.in);
        char[] s=in.next().toCharArray();
        boolean bl=false;
        for (int i=0;i<s.length;i++){
            for(int j=0;j<s.length;j++){
                if (s[i]==s[j] && i!=j){
                    bl=true;
                    break;
                }
            }
        }
        System.out.print(bl?"YES":"NO");
    }

    public static void Task_2() {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt(),b=in.nextInt(),k=0;
        while (a*b!=0){
            if (a>b){
                a-=b;
            }else{
                b-=a;
            }
            k++;
        }
        System.out.print((a==0?b:a)+" "+k);
    }

    public static void Task_3() {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt(),b=in.nextInt(),k=0;
        for(int i=a;i<=b;i++){
            boolean bl=true;
            for (int j=2;j<=Math.pow(i,0.5);j++){
                if (i%j==0){
                    bl=false;
                    break;
                }
            }
            if (bl){
                System.out.print(" "+i);
                k+=1;
            }
        }
        System.out.print(k>0?"":0);
    }

    public static void Task_4() {
        Scanner in = new Scanner(System.in);
        double a=in.nextDouble(),b=in.nextDouble(),c=in.nextDouble(),n=in.nextDouble();
        int s=0;
        String[] arr=new String[1000000];
        for (int i=0;i<=n/a;i++){
            for (int j=0;j<=n/b;j++){
                for (int k=0;k<=n/c;k++){
                    if (i*a+j*b+k*c==n){
                        arr[s++]=String.valueOf(i)+" "+String.valueOf(j)+" "+String.valueOf(k);
                        break;
                    }
                }
            }
        }
        System.out.println(s);
        for (int i=0;i<s;i++){
            System.out.println(arr[i]);
        }
    }

    public static void Task_5() {
        Scanner in=new Scanner(System.in);
        int arr[]=new int[10000];
        int x=in.nextInt(),max=x,k=0,s=0;
        if (x==0){
            System.out.print(s);
        }else {
            while (x != 0) {
                max = (x > max ? x : max);
                arr[k++] = x;
                x = in.nextInt();
            }
            for (int i : arr) {
                s += (max == i ? 1 : 0);
            }
            System.out.print(s);
        }
    }

    public static void Task_6() {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt(),arr[]=new int[10000],n=0,k=0,maxK1=-1,maxK2=-1;
        while (x != 0) {
            arr[n++] = x;
            x = in.nextInt();
        }
//        for (int i=0;i<n;i++){
//            System.out.print(arr[i]+"-");
//        }
        for (int i=0;i<n-1;i++){
            if (arr[i]>arr[i+1]){
                k++;
            }else{
                maxK1=(maxK1<k?k:maxK1);
                k=0;
            }
        }
        maxK1=(maxK1<k?k:maxK1);
        k=0;
        for (int i=0;i<n-1;i++){
            if (arr[i]<arr[i+1]){
                k++;
            }else{
                maxK2=(maxK2<k?k:maxK2);
                k=0;
            }
        }
        maxK2=(maxK2<k?k:maxK2);
        System.out.print(maxK1>maxK2?maxK1+1:maxK2+1);
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