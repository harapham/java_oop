import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class J03007 {
    public static boolean kiem_tra(String s){
        if(s.charAt(0)!='8'||s.charAt(s.length()-1)!='8') return false;
        String k="";
        int t=0;
        for(int i=s.length()-1;i>=0;i--){
            k+=s.charAt(i);
            t+=(s.charAt(i)-'0');
        }
        if(s.equals(k)&&t%10==0) return true;
        return false;
    }
    public static void main(String[] agrs){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            System.out.println(kiem_tra(s)==true ? "YES" : "NO" );
        }
    }
}
