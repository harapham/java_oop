import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Admin
 */
public class J01005 {
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            double n=sc.nextDouble(); 
            double h=sc.nextDouble();
            for(int i=1;i<n;i++){
                double k=h*Math.sqrt(i/n);
                System.out.printf("%.6f ", k);
            }
            System.out.println();
        }
    }
}
