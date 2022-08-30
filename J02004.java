import java.util.*;
/**
 *
 * @author Admin
 */
public class J02004 {
    public static boolean kt(Long a[], int n){
        for(int i=0;i<n/2;i++){
            if(a[i]!= a[n-1-i]) return false;
        }
        return true;
    }
    public static void main(String [] agrs){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Long a[]=new Long[n+5];
            for(int i=0;i<n;i++) a[i]=sc.nextLong();
            System.out.println(kt(a, n)==true ? "YES" : "NO" );
        }
    }
}
