import java.util.*;
/**
 *
 * @author Admin
 */
public class J01016 {
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int d=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='4'||s.charAt(i)=='7') d++;
        }
        System.out.print((d==4||d==7) ? "YES":"NO");
    }
}
