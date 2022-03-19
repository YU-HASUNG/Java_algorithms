import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int T = 1; //대각라인의 수
        int preT = 0; //지난 대각라인의 합

        while(true){
            if(N<=(T+preT)){
                //짝수와 홀수일 경우의 증가 방향이 다름
                if(T%2==0){
                    System.out.println((N-preT)+"/"+((T+1)-(N-preT))); 
                    break;
                }
                else{
                    System.out.println(((T+1)-(N-preT))+"/"+(N-preT));
                    break;
                }
            }
            else{
                preT = T+preT;
                T++;
            }
        }

        
    }
}