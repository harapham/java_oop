import java.util.*;
/**
 *
 * @author Admin
 */
public class J01010 {
    public static Long cat_doi(Long n){
        Long kq=0L;
        String s=Long.toString(n);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') kq=kq*10+1;
            else if(s.charAt(i)=='0'||s.charAt(i)=='8'||s.charAt(i)=='9') kq=kq*10;
            else{
                return -1L;
            }
        }
        return kq;
    }
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            Long n=sc.nextLong();
            Long kq=cat_doi(n);
            if(kq==-1L||kq==0L) System.out.println("INVALID");
            else System.out.println(kq);           
        }
    }
}
