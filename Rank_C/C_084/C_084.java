import java.util.*;
public class C_084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        //messageの周りを、＋で囲む
        
        int length = message.length();
        String boder = "+".repeat(length + 2);
        
        System.out.println(boder);
        System.out.println("+" + message + "+");
        System.out.println(boder);
        
    }
}