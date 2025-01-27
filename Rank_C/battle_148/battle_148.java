import java.util.Scanner;

/*勝ったら敵のレベルの半分レベルアップ。負けたら現在の自分のレベルの半分レベルダウン（小数点切り捨て） */


public class battle_148 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int battleCount = sc.nextInt();//戦闘回数
        int mylevel = sc.nextInt();//初期レベル
        
        for(int i = 0 ; i < battleCount ; i ++){
            
            int enemy = sc.nextInt();
            //System.out.println("敵のレベル" + enemy);
            if(enemy < mylevel){
                
                //System.out.println(mylevel + "に" + enemy/2 + "を加算");
                mylevel += enemy/2;
                
            }else if(enemy > mylevel){
                //System.out.println(mylevel + "が半分に・・・");
                mylevel = mylevel/2;
            }
        }
        
        System.out.println(mylevel);
        
        
    }
}