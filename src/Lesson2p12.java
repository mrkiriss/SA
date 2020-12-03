import java.util.*;

public class Lesson2p12 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Integer x=in.nextInt();

        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toOctalString(x));
        System.out.println(Integer.toHexString(x));
        System.out.println(Math.abs(x)<=Byte.MAX_VALUE?"YES":"NO");
        System.out.println(Math.abs(x)<=Short.MAX_VALUE?"YES":"NO");
    }
}
