import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class J02103 {
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=1;k<=t;k++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a[][]=new int[n][m];
            int kq[][]=new int[n][n];
            for(int i=0;i<n;i++)
                for(int j=0;j<m;j++) a[i][j]=sc.nextInt();
            for(int h=0;h<n;h++){
                for(int i=0;i<n;i++){
                    for(int j=0;j<m;j++){
                        kq[h][i]+=a[h][j]*a[i][j];
                    }
                }
            }
            System.out.printf("Test %d:\n", k);
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++) System.out.printf("%d ", kq[i][j]);
                System.out.println();
            }
        }
    }
}
