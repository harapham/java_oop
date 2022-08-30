import java.util.*;
/**
 *
 * @author Admin
 */
public class J01008 {
    public static void phan_tich(long n){
        for(int i=2;i*i<=n;i++){
            int k=0;
            while(n%i==0){
                k++;
                n/=i;
            }
            if(k>0) System.out.printf("%d(%d) ", i,k);
        }
        if(n>1) System.out.printf("%d(1) ", n);
        System.out.println();
    }
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){           
            long n=sc.nextLong();
            System.out.print("Test "+i+": ");
            phan_tich(n);
        }
    }
}
