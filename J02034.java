import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J02034 {
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[205];
        int en=0,x;
        for(int i=0;i<n;i++){
            x=sc.nextInt();
            a[x]=1;
            if(en<x) en=x;
        }
        int ok=0;
        for(int i=1;i<=en;i++){
            if(a[i]==0){
                System.out.println(i);
                ok=1;
            }
        }
        if(ok==0) System.out.println("Excellent!");
    }
}
