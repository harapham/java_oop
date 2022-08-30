import java.util.*;
/**
 *
 * @author Admin
 */
public class J01012 {
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            if(n%2==0){
                int k=0;
                for(int i=1;i*i<=n;i++){
                    if(n%i==0){
                        if(i%2==0) k++;
                        if((n/i)%2==0) k++;
                        if(n/i==i&&i%2==0) k--;
                    }
                }
                System.out.println(k);
            }
            else System.out.println(0);
        }
    }
}
