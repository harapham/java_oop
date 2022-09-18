import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class J02106 {
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]= new int[1005][1005];
        int dem,kq=0;
        for(int i=0;i<n;i++){
            dem=0;
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
                if(a[i][j]==1) dem++;
            }
            if(2*dem>3) kq++;
        }
        System.out.println(kq);
    }
}
