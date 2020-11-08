import java.util.Scanner;
// public static void main(String[] args) {
public class LessonStr {
    public static boolean IsDigit(char c){
        int ascii=c;
        return (ascii>47 && ascii<58?true:false);
    }
    public static void Task_1() {
        Scanner in=new Scanner(System.in);
        String c=in.nextLine();
        char chr=c.toCharArray()[0];
        System.out.print(IsDigit(chr)?"yes":"no");
    }

    public static char UpOrLow(char c){
        int ascii=c;
        if (ascii>64 && ascii<91){
            c=(char)(32+ascii);
        }else{
            c=(char)(-32+ascii);
        }
        return c;
    }
    public static void Task_2() {
        Scanner in=new Scanner(System.in);
        char c=in.nextLine().toCharArray()[0];
        int ascii=c;
        if (ascii>64 && ascii<91 || ascii>96 && ascii<123){
            System.out.print(UpOrLow(c));
        }else{
            System.out.print(c);
        }
    }
    public static void Task_3() {
        Scanner in=new Scanner(System.in);
        int s=1;
        char[] arr=in.nextLine().toCharArray();
        for (int i=0;i<arr.length;i++){
            s+=(arr[i]==' '?1:0);
        }
        System.out.print(s);
    }
    public static void Task_4() {
        Scanner in = new Scanner(System.in);
        int s = 1;
        String stt=in.nextLine()+" ";
        char[] arr = stt.toCharArray();
        String str = "", sM = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ' & i != arr.length - 1) {
                str += arr[i];
            } else {
                if (str.length() > sM.length()) {
                    sM = str;
                }
                str = "";
            }
        }
        System.out.println(sM);
        System.out.println(sM.length());
    }

    public static void Task_5() {
        Scanner in=new Scanner(System.in);
        char[] arr = in.nextLine().toCharArray();
        boolean bl=true;
        for (int i=0;i<arr.length/2;i++){
            if (arr[i]!=arr[arr.length-i-1]){
                bl=false;
                break;
            }
        }
        System.out.print(bl?"yes":"no");
    }
    public static void Task_6() {
        Scanner in=new Scanner(System.in);
        char[] arr = in.nextLine().toCharArray();
        brk:for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[j]==arr[i]){
                    System.out.print(arr[i]);
                    break brk;
                }
            }
        }

    }
    public static void Task_7() {
        Scanner in=new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = 0, y = 0,k=0;
        while (in.hasNext()) {
            String splited[]=in.nextLine().split(" ");
            char[] s = splited[0].toCharArray();
            Integer n=Integer.parseInt(splited[1]);
            //System.out.println(n*n + "--" + splited[0]);
            if (splited[0].equals("North")) y += n;
            if (splited[0].equals("South")) y -= n;
            if (splited[0].equals("East")) x += n;
            if (splited[0].equals("West")) x -= n;
        }
        System.out.println(x + " " + y);
    }
    public static void Task_8() {
        Scanner in=new Scanner(System.in);
        int k=0;
        char[] arr = in.nextLine().toCharArray();
        char[] narr= new char[arr.length];

        for (int i=0;i<arr.length;i++){
            if(arr[i]!=' '){
                narr[k++]=arr[i];
            }
        }

        boolean bl=true;
        for (int i=0;i<k/2;i++){
            if (narr[i]!=narr[k-i-1]){
                bl=false;
                break;
            }
        }
        System.out.print(bl?"yes":"no");
    }
    public static void Task_9() {
        Scanner in=new Scanner(System.in);
        char[] s=in.nextLine().toCharArray();
        int n=in.nextInt();
        for(int i=0;i<s.length;i++){
            int ascii=s[i];
            if (ascii-n<65){
                ascii=ascii+26-n;
            }else{
                ascii=ascii-n;
            }
            System.out.print((char)ascii);
        }
    }
    public static void Task_10() {
        Scanner in=new Scanner(System.in);
        char[] s=in.nextLine().toCharArray();
        for (int i=0;i<s.length;i++){
            if (s[i]!=' ' || i==s.length-1 || s[i+1]!=' ') System.out.print(s[i]);
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