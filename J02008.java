import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J02008 {
    public static long uc(long a,long b){
        if(b==0) return a;
        return uc(b,a%b);
    }
    public static long bc(long a, long b){
        return a*b/uc(a,b);
    }
    
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextInt();
            long k=1;
            for(int i=2;i<=n;i++){
                k=bc(k,i);
            }
            System.out.println(k);
        }
    }
}
