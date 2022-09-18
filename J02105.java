import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class J02105 {
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        byte a[][]=new byte[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                a[i][j]=sc.nextByte();
            }
        }
        for(int i=1;i<=n;i++){
            System.out.printf("List(%d) = ",i);
            for(int j=1;j<=n;j++){
                if(a[i][j]==1) System.out.printf("%d ", j);
            }
            System.out.println();
        }
    }
}
