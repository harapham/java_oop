import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class J02020 {
    static int ok=0,k,n;
    static int a[]=new int[15];
    public static void sinh(){
        int i=k;
        while(a[i]==n-k+i) i--;
        if(i>0){
            a[i]++;
            for(int j=i+1;j<=k;j++) a[j]=a[i]-i+j;
        }
        else ok=1;
    }
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        for(int i=1;i<=k;i++) a[i]=i;
        int dem=0;
        while(ok==0){
            for(int i=1;i<=k;i++) System.out.printf("%d ",a[i]);
            System.out.println();
            dem++;
            sinh();
        }
        System.out.printf("Tong cong co %d to hop\n", dem);
    }
}
