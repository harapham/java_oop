import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class J01013 {
    static int max_v=(int)2e6;
    static int pr[]=new int[max_v+5];
    public static void prime(){
        for(int i=2;i*i<=max_v;i++){
            if(pr[i]==0){
                for(int j=i;j<=max_v;j+=i){
                    if(pr[j]==0) pr[j]=i;
                }
            }
        }
        for(int i=2;i<=max_v;i++)
            if(pr[i]==0) pr[i]=i;
    }
    
    public static long tong_uoc(int k){
        long t=0;
        while(k!=1){
            t+=pr[k];
            k/=pr[k];
        }
        return t;
    }
    
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long kq=0;
        prime();
        while(n-->0){
            int k=sc.nextInt();
            if(k==0||k==1) kq+=k;
            else 
            kq+=tong_uoc(k);
        }
        System.out.println(kq);
    }
}
