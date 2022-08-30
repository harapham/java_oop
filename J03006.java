import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J03006 {
    static boolean kt(String s){
        String k="";
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)-'0')%2!=0) return false;
        }
        for(int i=s.length()-1;i>=0;i--){
            k+=s.charAt(i);
        }
        if(s.equals(k)) return true;
        return false;
    }
    public static void main(String [] agrs){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            System.out.println(kt(s)==true ? "YES" : "NO" );
        }
    }
}
