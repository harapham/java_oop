import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class J01022 {
    static long f[]=new long[100];
    public static int kiem_tra(int n,long k){
        if(n==1) return 0;
        if(n==2) return 1;
        if(k>f[n-2]) return kiem_tra(n-1,k-f[n-2]);
        return kiem_tra(n-2,k);
    }
    public static void main(String[] agrs){
        f[1]=1;f[2]=1;
        for(int i=3;i<93;i++) f[i]=f[i-2]+f[i-1];
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long k=sc.nextLong();
            System.out.println(kiem_tra(n, k));
        }
    }
}
