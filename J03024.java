import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class J03024 {
    public static int so_uuthe(String s){
        int d=0;
        if(s.charAt(0)=='0') return 2;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)-'0'<0||s.charAt(i)-'0'>9) return 2;
            if((s.charAt(i)-'0')%2==0) d++;
        }
        if((2*d>s.length()&&s.length()%2==0)||(2*d<s.length()&&s.length()%2==1)) return 1;
        return 0;
    }
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int i=so_uuthe(s);
            if(i==2) System.out.println("INVALID");
            else if(i==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
