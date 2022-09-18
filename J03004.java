import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J03004 {
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            s=s.trim().toLowerCase();            
            String ss[]=s.split("\\s+");
            for(String w: ss){
                System.out.print(w.substring(0,1).toUpperCase()+w.substring(1)+' ');
            }
            System.out.println();
        }
    }
}
