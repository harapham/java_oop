import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Admin
 */
public class J01017 {
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            Long n=sc.nextLong();
            String s=Long.toString(n);
            int ok=0;
            for(int i=0;i<s.length()-1;i++){
                if(Math.abs(s.charAt(i)-s.charAt(i+1))!=1){
                    ok=1;
                    break;
                }              
            }
            System.out.println(ok==0 ? "YES" : "NO");
        }
    }
}
