import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class J02010 {
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int temp;
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
            System.out.printf("Buoc %d: ",i+1);
            for(int j=0;j<n;j++)
                System.out.printf("%d ",a[j]);
            System.out.println();
        }
    }
}
