
import java.util.Scanner;
public class J01001 {
    public static void main (String[] agrs){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println(a<=0||b<=0? 0:((a+b)*2+" "+a*b));
       in.close();
    }
}
