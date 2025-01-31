import java.util.*;
public class C_097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Applicant = (sc.nextInt());
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        //2の倍数ならA、4の倍数ならB、両方満たせばAB、奇数ならN.
        
        for(int i = 1 ; i < Applicant + 1 ; i++){
                
            if(i % x == 0 && i % y == 0){
                System.out.println("AB");
            }else if(i % x == 0 || i % y == 0){
                if(i % x != 0){
                    System.out.println('B');
                }else{
                    System.out.println('A');
                }
            }else{
                System.out.println('N');
            }
        }

    }
}