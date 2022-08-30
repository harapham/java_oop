import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class J02011 {
    public static void main(String [] agrs){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=0;i<n-1;i++){
            int id=i;
            for(int j=i;j<n;j++){
                if(a[j]<a[id]){
                    id=j;
                }
            }
            int t=a[i];
            a[i]=a[id];
            a[id]=t;
            System.out.printf("Buoc %d: ", i+1);
            for(int j=0;j<n;j++) System.out.printf("%d ", a[j]);
            System.out.println();
        }
    }
}
