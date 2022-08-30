import java.util.*;
/**
 *
 * @author Admin
 */
public class J01024 {
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int ok=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!='1'&&s.charAt(i)!='2'&&s.charAt(i)!='0'){
                    System.out.println("NO");
                    ok=1;
                    break;
                }
            }
            if(ok==0) System.out.println("YES");
        }
    }
}
