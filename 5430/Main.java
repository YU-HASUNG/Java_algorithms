import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
/*
    시간초과ㅠㅠ
*/
public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int i=0; i<T; i++){

            String function = br.readLine();
            int arrayLength = Integer.parseInt(br.readLine());
            String tempArray = br.readLine();
            ArrayList<Integer> list = new ArrayList<>();
            int bool = 1;

            //배열의 정수만 저장
            for(int j=0; j<arrayLength*2; j++){
                if(j%2 != 0){
                    list.add(tempArray.charAt(j)-'0');
                }
            }

            for(int k=0; k<function.length(); k++){
                switch (function.charAt(k)) {
                    case 'R':
                        Collections.reverse(list);
                        break;
                    
                    case 'D':
                        if(list.isEmpty()){
                            System.out.println("error");
                            bool = -1;
                            break;
                        }
                        else{
                            list.remove(0);
                        }
                        break;
                        
                    default:
                        break;
                }
                if(bool != 1){
                    break;
                }
            }
            
            if(bool == 1){
                System.out.println(list);
            }
        }

    }
}