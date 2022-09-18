import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Admin
 */
public class J01025 {
    public static void main(String[] agrs){
        Scanner sc=new Scanner (System.in);
        int x_max=0,y_max=0,x_min=1005,y_min=1005;
        int a;
        for(int i=0;i<8;i++){
            a=sc.nextInt();
            if(i%2==0){
                x_min=Math.min(x_min,a);
                x_max=Math.max(x_max,a);
            }
            else{
                y_min=Math.min(y_min,a);
                y_max=Math.max(y_max,a);
            }
        }
        System.out.print((int)Math.pow(Math.max(x_max-x_min, y_max-y_min), 2));
        
        
        
    }
}
