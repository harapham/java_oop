import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class J01021 {
    static long mod =1000000007l;
    public static long luy_thua(long a,long b){
        if(b==0) return 1L;
        long c=luy_thua(a,b/2);
        c=(c*c)%mod;
        if(b%2==0) return c%mod;
        return (c*a)%mod;
    }
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        while(true){
            long a=sc.nextLong();
            long b=sc.nextLong();
            if(a==0&&b==0) break;
            else 
                System.out.println(luy_thua(a, b));
        }
    }
}
