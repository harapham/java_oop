import java.util.*;
/**
 *
 * @author Admin
 */
public class J03027 {
    public static void main(String [] agrs){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Stack<Character> st= new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(st.empty()) st.push(s.charAt(i));
            else{
                if(s.charAt(i)==st.peek()) st.pop();
                else st.push(s.charAt(i));
            }
        }
        String kq="";
        while(!st.empty()){
            kq=st.peek()+kq;
            st.pop();
        }
        System.out.println(kq=="" ? "Empty String" : kq );
    }
}
