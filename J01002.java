import java.util.Scanner;

public class J01002 {
    public static void main(String[] agrs){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            long n=in.nextLong();
            System.out.println(n*(n+1)/2);
        }
        in.close();
    }
}
