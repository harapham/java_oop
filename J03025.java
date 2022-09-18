import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class J03025 {
    public static boolean xau_dx(String s){
        int k=0;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)) k++;
            if(k>1) return false;
        }
        if((k==1&&s.length()%2==0)||(k<=1&&s.length()%2==1))return true;
        return false;
    }
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            System.out.println(xau_dx(s)==true ? "YES" : "NO" );
        }
    }
}
