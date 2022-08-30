import java.util.*;
/**
 *
 * @author Admin
 */
public class J01004 {
    public static boolean nguyen_to(long n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++)
            if(n%i==0) return false;
        return true;
    }
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            System.out.println(nguyen_to(n)==true? "YES":"NO");
        }
    }
}
