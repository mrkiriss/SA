import java.util.*;
// public static void main(String[] args) {
public class Lesson181 {
    public static void Task_1() {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(), a[]=new int [n];
        for(int i=0;i<n;i++){
            a[i]=(int) in.nextInt();
        }
        int x= in.nextInt();
        boolean bl=true;
        for(int i=0;i<n;i++){
            if (a[i]==x){
                bl=false;
                System.out.println(i+1);
                break;
            }
        }
        if (bl) System.out.println("NO");
    }
    public static void Task_2() {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),s=0;
        boolean bl=true;
        for(int i=0;i<n;i++){
            int x=in.nextInt();
            if (x%2==0){
                bl=false;
                s+=x;
            }
        }
        System.out.println(bl?"NO":s);
    }
    public static void Task_3() {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        double s=0,k=0;
        boolean bl=true;
        double ans=0;
        for(int i=0;i<n;i++){
            double x=in.nextDouble();
            if (Math.abs(x)%2==1){
                bl=false;
                s+=x;
                k+=1;
            }
        }
        if (bl){
            System.out.println("NO");
        }else{
            ans=s/k;
            System.out.printf("%.2f",ans);
        }
    }
    public static void Task_4() {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),s=4;
        for(int i=0;i<n;i++){
            System.out.print(s+" ");
            s+=3;
        }
    }
    public static void Task_5() {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),a[]=new int [n],x;
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        for(int i=0;i<n/2;i++){
            x=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=x;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void Task_6() {
        Scanner in=new Scanner(System.in);
        int k[]=new int[10000],firstIndex[]=new int[10000],maxK=-1,maxE=-1,n=in.nextInt();

        for (int i=0;i<10000;i++){
            k[i]=0;
            firstIndex[i]=10000000;
        }
        for (int i=0;i<n;i++){
            int ind=in.nextInt();
            k[ind]+=1;
            if (firstIndex[ind]==10000000) firstIndex[ind]=i;
        }
        for (int i=0;i<10000;i++){
            if (k[i]>maxK) maxK=k[i];
        }
        int len=0,j=0;
        for (int i=0;i<10000;i++){
            if (k[i]==maxK) len++;
        }

        int second[]=new int[len];
        for (int i=0;i<10000;i++){
            if (k[i]==maxK) second[j++]=i;
        }

        //for (int i:firstIndex) System.out.print(i+" ");

        int minInd=10000001;
        for (int i=0;i<len;i++){
            if (minInd>firstIndex[second[i]]){
                maxE=second[i];
                minInd=firstIndex[second[i]];
            }
        }
        System.out.println(maxE);
    }
    public static void Task_7() {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt(), a[]=new int[n],neg[]=new int[n],pos[]=new int[n],negK=0,posK=0;
        for (int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        for (int i=0;i<n;i++){
            if (a[i]<0){
                neg[negK++]=a[i];
            }else{
                pos[posK++]=a[i];
            }
        }
        for (int i=0;i<posK;i++){
            neg[negK+i]=pos[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(neg[i]+" ");
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
            }
            task=in.nextInt();
        }
    }
}