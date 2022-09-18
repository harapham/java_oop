import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class J02013 {
    public static void main(String[] agrs){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int ok;
        for(int i=0;i<n;i++){
            ok=0;
            for(int j=0;j<n-1;j++){
                if(a[j]>a[j+1]){
                    ok=1;
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
            if(ok==0) break;
            System.out.printf("Buoc %d: ", i+1);
            for(int j=0;j<n;j++) System.out.printf("%d ",a[j]);
            System.out.println();
        }
    }
}
