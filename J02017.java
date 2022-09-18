import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Admin
 */
public class J02017 {
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x;
        Stack<Integer> s=new Stack<Integer>();
        for(int i=0;i<n;i++){
            x=sc.nextInt();
            if(s.empty()) s.push(x);
            else{
                if((x+s.peek())%2==0) s.pop();
                else s.push(x);
            }
        }
        System.out.println(s.size());
    }
}
