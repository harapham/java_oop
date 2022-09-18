import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J02014 {
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        byte t=sc.nextByte();
        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int sum=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                sum+=a[i];
            }
            int ok=-1,x=0;
            for(int i=0;i<n;i++){
                if(x*2+a[i]==sum){
                    ok=i+1;
                    break;
                }
                x+=a[i];
            }
            System.out.println(ok);
        }
    }
}
