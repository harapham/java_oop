import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class J02101 {
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n*n+1];
            for(int i=1;i<=n*n;i++) a[i]=sc.nextInt();
            for(int i=1;i<=n;i++){
                if(i%2==1){
                    for(int j=1;j<=n;j++) System.out.printf("%d ",a[(i-1)*n+j]);
                }
                else for(int j=0;j<n;j++) System.out.printf("%d ", a[n*i-j]);
            }
            System.out.println();
        }
    }
}
