import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class J01006 {
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long a[]=new long[100];
        a[0]=0;
        a[1]=1;
        for( int i=2;i<=92;i++){
            a[i]=a[i-1]+a[i-2];
        }
        while(t-->0){
            System.out.println(a[sc.nextInt()]);
        }
    }
}

