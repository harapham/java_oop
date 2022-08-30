import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Admin
 */
public class J01018 {
    public static boolean so_lk(Long a){
        String s=Long.toString(a);
        int t=0;
        for(int i=0;i<s.length();i++) t+=s.charAt(i)-'0';
        if(t%10!=0) return false;
        for(int i=0;i<s.length()-1;i++){
            if(Math.abs(s.charAt(i)-s.charAt(i+1))!=2) return false;
        }
        return true;
    }
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            Long a=sc.nextLong();
            System.out.println(so_lk(a)==true ? "YES" : "NO" );
        }
    }
}
