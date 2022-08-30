
/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class J01003 {
    public static void main(String[] agrs){
        Scanner in=new Scanner(System.in);
        double a=in.nextDouble();
        double b=in.nextDouble();
        if(a==0&&b==0) System.out.println("VSN");
        else if (a==0&&b!=0) System.out.println("VN");
        else System.out.printf("%.2f",-b/a);
    }
}
