import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class J03005 {
    public static void main(String [] agrs){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            s=s.trim().toLowerCase();
            String ss[]=s.split("\\s+");
            for(int i=1;i<ss.length;i++){
                System.out.print(ss[i].substring(0,1).toUpperCase()+ss[i].substring(1));
                if(i!=ss.length-1) System.out.print(" ");
                else System.out.print(", ");
            }
            System.out.println(ss[0].toUpperCase());
        }
    }
}
