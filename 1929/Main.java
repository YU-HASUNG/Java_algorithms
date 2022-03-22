import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

    
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        for(int i=M;i<=N;i++){
            if(N == 2){
                System.out.println(N);
                break;
            }
            prime(i);
        }

    }

    public static void prime(int number){

        if(number < 2){
            return;
        }
        
        
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0){
                return;
            }
        }
        System.out.println(number);
    }
}