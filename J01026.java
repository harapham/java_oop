import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Admin
 */
public class J01026 {
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long a=sc.nextLong();
            long b=(long)Math.sqrt(a);          
            if(b*b==a) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
