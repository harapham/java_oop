import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class J02007 {
    public static void main(String [] agrs){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=1;k<=t;k++){
            System.out.print("Test "+k+":\n");
            int n=sc.nextInt();
            int a[]=new int[n];
            int xh[]=new int[100001];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                xh[a[i]]++;
            }
            for(int i=0;i<n;i++){
                if(xh[a[i]]>0){
                    System.out.print(a[i]+" xuat hien "+xh[a[i]]+" lan\n");
                    xh[a[i]]=0;
                }
            }
        }
    }
}
