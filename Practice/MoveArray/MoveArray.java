import java.util.*;


public class MoveArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayContents = sc.nextInt() ;
        int operations = sc.nextInt() ;
        
        List<Integer> listIn = new ArrayList<>();
        
        for(int i = 0 ; i < arrayContents ; i++){
            listIn.add(sc.nextInt()) ;
        }
        
        for(int j = 0 ; j < operations ; j++){
            int operationType = sc.nextInt();
            
            switch(operationType){
                case 0 :
                    listIn.add(sc.nextInt()) ;
                    break ;

                case 1 :
                    listIn.remove(listIn.size() - 1);
                    break ;

                case 2:
                    int i = 0 ;//どうしても拡張for文を使いたい
                    for(int list : listIn){
                        
                        if(i < listIn.size() -1){
                            System.out.print(list + " ");
                        }else{
                            System.out.println(list);
                        }
                        
                        i++;
                    }
                    break ;
                    
                default:
                    System.out.println("0~2を入力してください");
            }
        }
    }
        
        
}
