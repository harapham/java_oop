import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J01014 {
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long kq=0l;
            for(long i=2l;i*i<=n;i++){
                if(n%i==0){
                    kq=i;
                    while(n%i==0) n/=i;
                }                  
            }
            if(n>1) kq=n;
            System.out.println(kq);
        }
    }
}
