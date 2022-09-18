import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class J03032 {
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            String ss[]=s.split(" ");
            for(String w: ss){
                for(int i=w.length()-1;i>=0;i--) System.out.print(w.charAt(i));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
