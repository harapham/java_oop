import java.util.*;
/**
 *
 * @author Admin
 */
public class J01009 {
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long s=1,k=1;
        for(int i=2;i<=n;i++){
            k*=i;
            s+=k;
        }
        System.out.print(s);
    }
}
