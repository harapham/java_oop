import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class J02006 {
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        
        boolean kt[]=new boolean[1005];
        for(int i=0;i<n;i++){
            kt[sc.nextInt()]=true;
        }
        for(int i=0;i<m;i++){
            kt[sc.nextInt()]=true;
        }
        for(int i=0;i<1000;i++){
            if(kt[i]==true){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
