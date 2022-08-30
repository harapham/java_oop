import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Admin
 */
public class J02005 {
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        boolean kt[]=new boolean[1005];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            kt[a[i]]=true;
        }
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        Arrays.sort(b);
        for(int i=0;i<m;i++)
            if(kt[b[i]]==true){
                System.out.print(b[i]+" ");
                kt[b[i]]=false;
            }
        System.out.println();
    }
}
