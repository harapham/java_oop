import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class J01011 {
    public static long usc(long a,long b){
        if(b==0) return a;
        return usc(b,a%b);
    }
    public static long bsc(long a,long b){
        return a*b/usc(a,b);
    }
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            System.out.printf("%d %d\n", bsc(a,b),usc(a,b));            
        }
    }
}
