import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class J02012 {
    public static void main(String[] agrs){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.printf("Buoc 0: %d\n", a[0]);
        for(int i=1;i<n;i++){
            int t=a[i];
            int j=i-1;
            while(j>=0&&a[j]>t){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=t;
            System.out.printf("Buoc %d: ", i);
            for(int k=0;k<=i;k++) System.out.printf("%d ", a[k]);
            System.out.println();
        }
    }
}
