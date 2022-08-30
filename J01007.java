import java.util.*;
/**
 *
 * @author Admin
 */
public class J01007 {
    public static void main(String[] agrs){
        long a[]=new long[93];
        a[0]=0;
        a[1]=1;
        for(int i=2;i<=92;i++) a[i]=a[i-1]+a[i-2];
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long k=sc.nextLong();
            int ok=0;
            for(int i=0;i<93;i++){
                if(a[i]==k){
                    System.out.println("YES");
                    ok=1;
                    break;
                }
                if(a[i]>k) break;
            }
            if(ok==0) System.out.println("NO");
        }
    }
}
